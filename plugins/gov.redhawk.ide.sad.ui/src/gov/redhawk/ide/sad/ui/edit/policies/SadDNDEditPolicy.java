/*******************************************************************************
 * This file is protected by Copyright. 
 * Please refer to the COPYRIGHT file distributed with this source distribution.
 *
 * This file is part of REDHAWK IDE.
 *
 * All rights reserved.  This program and the accompanying materials are made available under 
 * the terms of the Eclipse Public License v1.0 which accompanies this distribution, and is available at 
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package gov.redhawk.ide.sad.ui.edit.policies;

import gov.redhawk.diagram.edit.helpers.ComponentPlacementEditHelperAdvice;

import java.util.HashMap;

import mil.jpeojtrs.sca.partitioning.ComponentFile;
import mil.jpeojtrs.sca.sad.SadFactory;
import mil.jpeojtrs.sca.sad.SoftwareAssembly;
import mil.jpeojtrs.sca.sad.diagram.providers.SadElementTypes;
import mil.jpeojtrs.sca.spd.SoftPkg;
import mil.jpeojtrs.sca.spd.SpdFactory;
import mil.jpeojtrs.sca.spd.impl.SoftPkgImpl;
import mil.jpeojtrs.sca.util.ScaFileSystemConstants;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.filesystem.EFS;
import org.eclipse.core.filesystem.IFileStore;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequestFactory;
import org.eclipse.gmf.runtime.diagram.ui.requests.DropObjectsRequest;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;

/**
 * @since 4.0
 */
public class SadDNDEditPolicy extends DragDropEditPolicy {

	/**
	 * {@inheritDoc}
	 */
	@SuppressWarnings("unchecked")
	@Override
	protected Command getDropElementCommand(final EObject element, final DropObjectsRequest request) {
		if (element instanceof SoftPkg) {
			final SoftPkg spd = (SoftPkg) element;
			// See if this file exists in the target SDR Root...if not it will
			// need to be copied in
			final URI uri = URI
			        .createHierarchicalURI(ScaFileSystemConstants.SCHEME_TARGET_SDR_DOM, null, null, spd.eResource().getURI().segments(), null, null);
			IFileStore store;
			try {
				store = EFS.getStore(java.net.URI.create(uri.toString()));
			} catch (final CoreException e) {
				return super.getDropElementCommand(element, request);
			}

			if (!store.fetchInfo().exists()) {
				return super.getDropElementCommand(spd, request);
			}

			final SoftwareAssembly sad = SoftwareAssembly.Util.getSoftwareAssembly(getHostObject().eResource());
			final URI spdURI = URI.createURI(spd.eResource().getURI().toString()).appendFragment(SoftPkg.EOBJECT_PATH);
			SoftPkgImpl softPkg = (SoftPkgImpl) SpdFactory.eINSTANCE.createSoftPkg();
			softPkg.eSetProxyURI(spdURI);
			softPkg = (SoftPkgImpl) EcoreUtil.resolve(softPkg, sad);

			final CompoundCommand cc = new CompoundCommand("Add Component");

			// Create the new component placement
			final CreateViewRequest createRequest = CreateViewRequestFactory.getCreateShapeRequest(SadElementTypes.SadComponentPlacement_3001,
			        ((IGraphicalEditPart) getHost()).getDiagramPreferencesHint());
			createRequest.setLocation(request.getLocation());

			final HashMap<Object, Object> map = new HashMap<Object, Object>();
			map.putAll(createRequest.getExtendedData());

			ComponentFile file = null;
			for (final ComponentFile f : sad.getComponentFiles().getComponentFile()) {
				if (f.getLocalFile().getName().equals(spdURI.path())) {
					file = f;
				}
			}

			if (file == null) {
				file = SadFactory.eINSTANCE.createComponentFile();
				file.setSoftPkg(softPkg);
				cc.add(new ICommandProxy(new AddFileCommand(sad, file)));
			}
			map.put(ComponentPlacementEditHelperAdvice.CONFIGURE_OPTIONS_SPD_URI, spdURI);
			createRequest.setExtendedData(map);

			final Command createCmd = getHost().getCommand(createRequest);

			cc.add(createCmd);

			return cc;
		}
		return super.getDropElementCommand(element, request);
	}

	private class AddFileCommand extends AbstractTransactionalCommand {

		private final SoftwareAssembly sad;
		private final ComponentFile file;

		/**
		 * @param domain
		 * @param label
		 * @param affectedFiles
		 */
		public AddFileCommand(final SoftwareAssembly sad, final ComponentFile file) {
			super(((IGraphicalEditPart) getHost()).getEditingDomain(), "Add component file " + file.getLocalFile().getName(), AbstractTransactionalCommand
			        .getWorkspaceFiles(getHostObject()));
			this.sad = sad;
			this.file = file;
		}

		/**
		 * {@inheritDoc}
		 */
		@Override
		protected CommandResult doExecuteWithResult(final IProgressMonitor monitor, final IAdaptable info) throws ExecutionException {
			this.sad.getComponentFiles().getComponentFile().add(this.file);

			return CommandResult.newOKCommandResult();
		}

	}
}

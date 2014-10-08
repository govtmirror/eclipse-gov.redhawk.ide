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
package gov.redhawk.ide.sad.graphiti.ui.diagram.features.custom.runtime;

import gov.redhawk.ide.sad.graphiti.debug.internal.ui.LocalGraphitiSadMultiPageScaEditor;
import gov.redhawk.ide.sad.graphiti.ui.diagram.util.DUtil;
import gov.redhawk.sca.ui.actions.StartAction;
import mil.jpeojtrs.sca.sad.SadComponentInstantiation;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICustomContext;
import org.eclipse.graphiti.features.custom.AbstractCustomFeature;

public class StartComponentFeature extends AbstractCustomFeature {

	private final StartAction action = new StartAction();
	
	public StartComponentFeature(IFeatureProvider fp) {
		super(fp);
	}
	
	@Override
	public String getDescription() {
		return "Start component";
	}
	
	@Override
	public String getName() {
		return "Start";
	}

	@Override
	public boolean canExecute(ICustomContext context) {
		Object object = DUtil.getBusinessObject(context.getPictogramElements()[0]);
		
		if (object instanceof SadComponentInstantiation && DUtil.getActiveEditor() instanceof LocalGraphitiSadMultiPageScaEditor) {
			return true;
		}
		
		return super.canExecute(context);
	}
	
	@Override
	public void execute(ICustomContext context) {
		Object[] selection = DUtil.getSelectedEditParts();
		for (Object obj : selection) {
			this.action.setContext(obj);
			this.action.run();
		}
	}
	
	
}
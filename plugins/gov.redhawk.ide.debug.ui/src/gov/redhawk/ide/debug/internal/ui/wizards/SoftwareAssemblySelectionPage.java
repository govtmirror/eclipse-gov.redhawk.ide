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
package gov.redhawk.ide.debug.internal.ui.wizards;

import gov.redhawk.ide.sdr.ui.SdrContentProvider;
import gov.redhawk.ide.sdr.ui.SdrLabelProvider;
import mil.jpeojtrs.sca.sad.SoftwareAssembly;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.beans.BeanProperties;
import org.eclipse.core.databinding.validation.IValidator;
import org.eclipse.core.databinding.validation.ValidationStatus;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.jface.databinding.viewers.ViewersObservables;
import org.eclipse.jface.databinding.wizard.WizardPageSupport;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerSorter;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;

/**
 * 
 */
public class SoftwareAssemblySelectionPage extends WizardPage {

	private LaunchLocalWaveformWizard wizard;
	private DataBindingContext dbc = new DataBindingContext();

	protected SoftwareAssemblySelectionPage(LaunchLocalWaveformWizard wizard) {
		super("selectSad", "Select Waveform", null);
		setDescription("Select a waveform to launch in the local Sandbox.");
		this.wizard = wizard;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.dialogs.IDialogPage#createControl(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	public void createControl(Composite parent) {
		Composite main = new Composite(parent, SWT.None);
		main.setLayout(new GridLayout(2, false));

		TreeViewer viewer = new TreeViewer(main, SWT.BORDER | SWT.FULL_SELECTION | SWT.V_SCROLL);
		viewer.getControl().setLayoutData(GridDataFactory.fillDefaults().grab(true, true).span(2, 1).create());
		viewer.setContentProvider(new SdrContentProvider() {
			@Override
			public boolean hasChildren(Object object) {
				if (object instanceof SoftwareAssembly) {
					return false;
				}
				return super.hasChildren(object);
			}
		});
		viewer.setLabelProvider(new SdrLabelProvider());
		viewer.setSorter(new ViewerSorter() {
			@Override
			public int compare(Viewer viewer, Object e1, Object e2) {
				if (e1 instanceof SoftwareAssembly && e2 instanceof SoftwareAssembly) {
					SoftwareAssembly spd1 = (SoftwareAssembly) e1;
					SoftwareAssembly spd2 = (SoftwareAssembly) e2;
					return spd1.getName().compareTo(spd2.getName());
				}
				return super.compare(viewer, e1, e2);
			}
		});

		Group descriptionGroup = new Group(main, SWT.None);
		descriptionGroup.setText("Description");
		descriptionGroup.setLayout(new GridLayout());
		descriptionGroup.setLayoutData(GridDataFactory.fillDefaults().span(2, 1).create());
		final Text descriptionField = new Text(descriptionGroup, SWT.READ_ONLY | SWT.MULTI | SWT.V_SCROLL | SWT.WRAP);
		descriptionField.setLayoutData(GridDataFactory.fillDefaults().hint(SWT.FILL, 100).grab(true, false).create());

		viewer.addSelectionChangedListener(new ISelectionChangedListener() {

			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				Object selection = ((IStructuredSelection) event.getSelection()).getFirstElement();
				if (selection instanceof SoftwareAssembly) {
					SoftwareAssembly sad = (SoftwareAssembly) selection;
					descriptionField.setText((sad.getDescription() == null) ? "" : sad.getDescription());
				} else {
					descriptionField.setText("");
				}
			}
		});

		dbc.bindValue(ViewersObservables.observeInput(viewer), BeanProperties.value(wizard.getClass(), "waveformsContainer").observe(wizard));
		dbc.bindValue(ViewersObservables.observeSingleSelection(viewer), BeanProperties.value(wizard.getClass(), "softwareAssembly").observe(wizard),
			new UpdateValueStrategy().setAfterConvertValidator(new IValidator() {

				@Override
				public IStatus validate(Object value) {
					if (value == null) {
						return ValidationStatus.error("Must select a waveform");
					}
					return ValidationStatus.ok();
				}

			}), null);

		WizardPageSupport.create(this, dbc);
		setControl(main);
	}

}

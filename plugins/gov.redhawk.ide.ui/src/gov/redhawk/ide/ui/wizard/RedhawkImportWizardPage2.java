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
package gov.redhawk.ide.ui.wizard;

import gov.redhawk.ide.codegen.ITemplateDesc;
import gov.redhawk.ide.codegen.internal.CodeGeneratorTemplatesRegistry;
import gov.redhawk.ide.ui.wizard.RedhawkImportWizardPage1.ProjectRecord;

import java.util.Arrays;

import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.ComboBoxCellEditor;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.TreeViewerColumn;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.osgi.util.NLS;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.ui.internal.wizards.datatransfer.DataTransferMessages;

/**
 * @since 9.1
 */
@SuppressWarnings("restriction")
public class RedhawkImportWizardPage2 extends WizardPage {
	private TreeViewer viewer;
	private ProjectRecord[] projects = null;

	public RedhawkImportWizardPage2() {
		this("redhawkImportWizard");
	}

	protected RedhawkImportWizardPage2(String pageName) {
		super(pageName);
		// Users are not required to make edits using this page
		setTitle("Import Projects");
		setDescription("Some projects are missing files and may require additional information");
		setPageComplete(true);
	}

	@Override
	public void createControl(Composite parent) {
		Composite workArea = new Composite(parent, SWT.NULL);
		workArea.setLayout(new GridLayout());
		workArea.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

		Label projectLabel = new Label(workArea, SWT.NONE);
		projectLabel.setText("Project Details: ");
		createProjectsTable(workArea);

		setControl(workArea);
	}

	private void createProjectsTable(Composite workArea) {
		viewer = new TreeViewer(workArea, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL | SWT.FULL_SELECTION | SWT.BORDER);
		final Tree projectTree = viewer.getTree();
		projectTree.setHeaderVisible(true);
		projectTree.setLinesVisible(true);

		viewer.setContentProvider(new RedhawkImportContentProvider());
		viewer.getControl().setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

		createColumns(workArea, viewer);
	}

	private void createColumns(Composite workArea, final TreeViewer viewer) {
		TreeViewerColumn nameColumn = new TreeViewerColumn(viewer, SWT.NONE);
		nameColumn.getColumn().setWidth(300);
		nameColumn.getColumn().setText("Project: ");
		nameColumn.setLabelProvider(new ColumnLabelProvider() {

			@Override
			public String getText(Object element) {
				if (element instanceof ProjectRecord) {
					ProjectRecord project = (ProjectRecord) element;
					String dir = project.projectSystemFile.getParentFile().getAbsolutePath();
					return NLS.bind(DataTransferMessages.WizardProjectsImportPage_projectLabel, project.getProjectName(), dir);
				}
				if (element instanceof ImplWrapper) {
					ImplWrapper implWrapper = (ImplWrapper) element;
					return implWrapper.getImpl().getId() + " (implementation)";
				}
				return "";
			}
		});

		// Get a String array of accepted template id's
		CodeGeneratorTemplatesRegistry reg = new CodeGeneratorTemplatesRegistry();
		ITemplateDesc[] templateDescriptions = reg.getTemplates();
		final String[] templates = new String[templateDescriptions.length];
		for (int i = 0; i < templateDescriptions.length; i++) {
			templates[i] = templateDescriptions[i].getId();
		}

		final TreeViewerColumn templateColumn = new TreeViewerColumn(viewer, SWT.NONE);
		templateColumn.getColumn().setWidth(500);
		templateColumn.getColumn().setText("Template: ");
		templateColumn.setLabelProvider(new ColumnLabelProvider() {

			@Override
			public String getText(Object element) {
				if (element instanceof ImplWrapper) {
					ImplWrapper implWrapper = (ImplWrapper) element;
					return implWrapper.getTemplate();
				} else {
					return "";
				}
			}
		});
		templateColumn.setEditingSupport(new EditingSupport(viewer) {

			@Override
			protected boolean canEdit(Object element) {
				return true;
			}

			@Override
			protected CellEditor getCellEditor(Object element) {
				ComboBoxCellEditor cellEditor = new ComboBoxCellEditor(viewer.getTree(), templates, SWT.READ_ONLY);
				return cellEditor;
			}

			@Override
			protected Object getValue(Object element) {
				if (element instanceof ImplWrapper) {
					ImplWrapper implWrapper = (ImplWrapper) element;
					String templateID = implWrapper.getTemplate();
					int index = Arrays.asList(templates).indexOf(templateID);
					return index;
				} else {
					return 0;
				}
			}

			@Override
			protected void setValue(Object element, Object value) {
				if (element instanceof ImplWrapper) {
					ImplWrapper implWrapper = (ImplWrapper) element;
					String template = templates[(Integer) value];
					implWrapper.setTemplate(template);
					viewer.update(element, null);
				}
			}
		});
	}

	@Override
	public void setVisible(boolean visible) {
		super.setVisible(visible);

		// Get selected list of projects from the previous page
		RedhawkImportWizardPage1 previousPage = (RedhawkImportWizardPage1) getPreviousPage();
		projects = previousPage.getProjectRecords();
		viewer.setInput(projects);
	}
}

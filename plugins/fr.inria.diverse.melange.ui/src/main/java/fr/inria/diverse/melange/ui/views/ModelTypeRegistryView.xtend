package fr.inria.diverse.melange.ui.views

import javax.annotation.PostConstruct
import org.eclipse.core.runtime.IConfigurationElement
import org.eclipse.core.runtime.Platform
import org.eclipse.e4.ui.di.Focus
import org.eclipse.jface.viewers.ArrayContentProvider
import org.eclipse.jface.viewers.ColumnLabelProvider
import org.eclipse.jface.viewers.TableViewer
import org.eclipse.jface.viewers.TableViewerColumn
import org.eclipse.swt.SWT
import org.eclipse.swt.layout.GridData
import org.eclipse.swt.widgets.Composite

class ModelTypeRegistryView
{
	private static final String MODELTYPE_EXTENSION_ID = "fr.inria.diverse.melange.modeltype"

	TableViewer viewer

	@PostConstruct
	def void createView(Composite parent) {
		viewer = new TableViewer(parent, SWT.BORDER)

		createColumns(viewer)

		viewer.contentProvider = ArrayContentProvider.instance
		viewer.input = Platform.extensionRegistry.getConfigurationElementsFor(MODELTYPE_EXTENSION_ID)

		viewer.table.headerVisible = true
		viewer.table.linesVisible = true

		viewer.control.layoutData = new GridData => [
			horizontalAlignment = SWT.FILL
			verticalAlignment = SWT.FILL
			horizontalSpan = 2
			grabExcessHorizontalSpace = true
			grabExcessVerticalSpace = true
		]
	}

	@Focus
	def void setFocus() {
		viewer.control.setFocus
	}

	private def void createColumns(TableViewer viewer) {
		new TableViewerColumn(viewer, SWT.NONE) => [
			column.width = 300
			column.text = "Identifier"
			setLabelProvider(new ColumnLabelProvider {
				override getText(Object o) {
					return (o as IConfigurationElement).getAttribute("id")
				}
			})
		]

		new TableViewerColumn(viewer, SWT.NONE) => [
			column.width = 300
			column.text = "URI"
			setLabelProvider(new ColumnLabelProvider {
				override getText(Object o) {
					return (o as IConfigurationElement).getAttribute("uri")
				}
			})
		]

//		new TableViewerColumn(viewer, SWT.NONE) => [
//			column.width = 300
//			column.text = "Description"
//			setLabelProvider(new ColumnLabelProvider {
//				override getText(Object o) {
//					return (o as IConfigurationElement).getAttribute("description")
//				}
//			})
//		]

//		new TableViewerColumn(viewer, SWT.NONE) => [
//			column.width = 500
//			column.text = "Subtype Of"
//			setLabelProvider(new ColumnLabelProvider {
//				override getText(Object o) {
//					return (o as IConfigurationElement).getChildren("adapter").map[a |
//						a.getAttribute("modeltypeId")
//					].join(", ")
//				}
//			})
//		]

		new TableViewerColumn(viewer, SWT.NONE) => [
			column.width = 300
			column.text = "Contributor"
			setLabelProvider(new ColumnLabelProvider {
				override getText(Object o) {
					return (o as IConfigurationElement).contributor.name
				}
			})
		]
	}
}

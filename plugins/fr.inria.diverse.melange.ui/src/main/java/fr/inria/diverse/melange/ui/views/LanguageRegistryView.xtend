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
import org.eclipse.swt.widgets.Composite

class LanguageRegistryView
{
	private static final String ADAPTER_ID = "fr.inria.diverse.melange.adapter"
	TableViewer viewer

	@PostConstruct
	def void createView(Composite parent) {
		val registry = Platform.extensionRegistry
		viewer = new TableViewer(parent, SWT.BORDER)

		createColumns(viewer)

		viewer.contentProvider = ArrayContentProvider.instance
		viewer.input = registry.getConfigurationElementsFor(ADAPTER_ID)
		
		viewer.table.headerVisible = true
		viewer.table.linesVisible = true
	}

	@Focus
	def void setFocus() {
		viewer.control.setFocus
	}

	private def void createColumns(TableViewer viewer) {
		new TableViewerColumn(viewer, SWT.NONE) => [
			column.width = 300
			column.text = "Metamodel URI"
			setLabelProvider(new ColumnLabelProvider {
				override getText(Object o) {
					return (o as IConfigurationElement).getAttribute("metamodel_uri")
				}
			})
		]

		new TableViewerColumn(viewer, SWT.NONE) => [
			column.width = 300
			column.text = "ModelType Name"
			setLabelProvider(new ColumnLabelProvider {
				override getText(Object o) {
					return (o as IConfigurationElement).getAttribute("modeltype_name")
				}
			})
		]

		new TableViewerColumn(viewer, SWT.NONE) => [
			column.width = 300
			column.text = "Adapter Class"
			setLabelProvider(new ColumnLabelProvider {
				override getText(Object o) {
					return (o as IConfigurationElement).getAttribute("class")
				}
			})
		]
	}
}

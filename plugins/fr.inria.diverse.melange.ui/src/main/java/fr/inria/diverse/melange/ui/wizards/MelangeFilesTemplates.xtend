package fr.inria.diverse.melange.ui.wizards

class MelangeFilesTemplates {
		
	def public static String buildProperties () {
		return '''source.. = src/,\
           xtend-gen/
output.. = bin/
bin.includes = plugin.xml,\
           META-INF/,\
           .
'''
	}

	
	def public static String getK3SLEStub(String pkgName, String ecoreUri, String mmName) {
		return '''package «pkgName»
		
metamodel «mmName» {
	ecore «ecoreUri»
	exactType «mmName»MT
}

@Main
transformation main() {
	println("Hello, SLE!")
}
'''
	}
	
	def	public static String eclipseResourcePrefs() {
		return '''eclipse.preferences.version=1
encoding/<project>=UTF-8'''
	}
}
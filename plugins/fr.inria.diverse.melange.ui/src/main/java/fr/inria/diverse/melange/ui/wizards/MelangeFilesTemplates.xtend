package fr.inria.diverse.melange.ui.wizards

class MelangeFilesTemplates
{
	def public static String getBuildProperties() {
		return '''
			source.. = src/,\
			           src-gen/,\
			           xtend-gen/
			bin.includes = plugin.xml,\
			               META-INF/,\
			               .
		'''
	}

	def public static String getK3SLEStub(String pkgName, String ecoreUri, String mmName) {
		return '''
			package «pkgName»

			language «mmName» {
				syntax «ecoreUri»
				exactType «mmName»MT
			}
			
		'''
	}

	def	public static String getEclipseResourcePrefs() {
		return '''
			eclipse.preferences.version=1
			encoding/<project>=UTF-8
		'''
	}
}

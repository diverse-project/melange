package fr.inria.diverse.melange.builder

import java.util.List

interface Builder {
	def void preBuild()
	def void make()
	def void postBuild()
	def List<Error> getErrors()
}

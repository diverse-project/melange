package fr.inria.diverse.melange.test.overridding.aspects

import fr.inria.diverse.k3.al.annotationprocessor.Aspect

import fr.inria.diverse.root.A

@Aspect(className=A)
class Asp0 {
	def String whoIAm(){
		return "Asp0"
	}
}

@Aspect(className=A)
class Asp1a {
	def String whoIAm(){
		return "Asp1a"
	}
}

@Aspect(className=A)
class Asp1b {
	def String whoIAm(){
		return "Asp1b"
	}
}

@Aspect(className=A)
class Asp2 {
	def String whoIAm(){
		return "Asp2"
	}
}

@Aspect(className=A)
class Asp3 {
	def String whoIAm(){
		return "Asp3"
	}
}

@Aspect(className=A)
class Asp4 {
	def String whoIAm(){
		return "Asp4"
	}
}




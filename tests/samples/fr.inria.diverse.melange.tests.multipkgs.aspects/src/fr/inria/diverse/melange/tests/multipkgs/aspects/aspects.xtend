package fr.inria.diverse.melange.tests.multipkgs.aspects

import toppkg.TopClass1
import toppkg.TopClass2
import toppkg.subpkg1.Subpkg1Class1
import toppkg.subpkg1.Subpkg1Class2
import toppkg.subpkg2.Subpkg2Class1
import toppkg.subpkg2.Subpkg2Class2
import toppkg.subpkg2.subpkg3.Subpkg3Class1
import toppkg.subpkg2.subpkg3.Subpkg3Class2
import fr.inria.diverse.k3.al.annotationprocessor.Aspect

import static extension fr.inria.diverse.melange.tests.multipkgs.aspects.TopClass1Aspect.*
import static extension fr.inria.diverse.melange.tests.multipkgs.aspects.TopClass2Aspect.*
import static extension fr.inria.diverse.melange.tests.multipkgs.aspects.Subpkg1Class1Aspect.*
import static extension fr.inria.diverse.melange.tests.multipkgs.aspects.Subpkg1Class2Aspect.*
import static extension fr.inria.diverse.melange.tests.multipkgs.aspects.Subpkg2Class1Aspect.*
import static extension fr.inria.diverse.melange.tests.multipkgs.aspects.Subpkg2Class2Aspect.*
import static extension fr.inria.diverse.melange.tests.multipkgs.aspects.Subpkg3Class1Aspect.*
import static extension fr.inria.diverse.melange.tests.multipkgs.aspects.Subpkg3Class2Aspect.*
import java.util.List
import org.eclipse.emf.common.util.EList

@Aspect(className=TopClass1)
class TopClass1Aspect {
	def void visit(){
		println(_self.eClass.name)
		_self.mySubPkg1Class1.forEach[visit]
		_self.mySubpkg2Class1.forEach[visit]
		_self.myTopClass2.forEach[visit]
	}
}

@Aspect(className=TopClass2)
class TopClass2Aspect {
	def void visit(){
		println(_self.eClass.name)
	}
}

@Aspect(className=Subpkg1Class1)
class Subpkg1Class1Aspect {
	def void visit(){
		println(_self.eClass.name)
		_self.mySubpkg1Class2.forEach[visit]
	}
}

@Aspect(className=Subpkg1Class2)
class Subpkg1Class2Aspect {
	def void visit(){
		println(_self.eClass.name)
	}
}

@Aspect(className=Subpkg2Class1)
class Subpkg2Class1Aspect {
	def void visit(){
		println(_self.eClass.name)
		_self.mySubpkg2Class2.forEach[visit]
	}
}

@Aspect(className=Subpkg2Class2)
class Subpkg2Class2Aspect {
	def void visit(){
		println(_self.eClass.name)
		_self.mySubpkg3Class1.forEach[visit]
	}
}

@Aspect(className=Subpkg3Class1)
class Subpkg3Class1Aspect {
	def void visit(){
		println(_self.eClass.name)
		_self.mySubpkg3Class2.forEach[visit]
	}
}

@Aspect(className=Subpkg3Class2)
class Subpkg3Class2Aspect {
	def void visit(){
		println(_self.eClass.name)
	}
}

@Aspect(className=toppkg.ClassA)
class TopClassAAspect {
	
	public EList<toppkg.subpkg2.subpkg3.ClassA> toSubClassA
	
	def void visit(){
		println(_self.eClass.name)
	}
}

@Aspect(className=toppkg.subpkg2.subpkg3.ClassA)
class SubClassAAspect {
	
	public toppkg.ClassA toUpperClassA
	
	def void visit(){
		println(_self.eClass.name)
	}
}
package fr.inria.diverse.melange.tests.dispatch.main;

import fr.inria.diverse.melange.tests.dispatch.main.l1.adapters.l1mt.L1Adapter;
import fr.inria.diverse.melange.tests.dispatch.main.l1mt.dispatchroot.B;
import fr.inria.diverse.melange.tests.dispatch.main.l2.adapters.l1mt.L2Adapter;
import fr.inria.diverse.melange.tests.dispatch.main.l3.adapters.l1mt.L3Adapter;
import fr.inria.diverse.melange.tests.dispatch.main.l4.adapters.l1mt.L4Adapter;
import fr.inria.diverse.melange.tests.dispatch.main.l4.dispatchroot.DispatchrootFactory;
import fr.inria.diverse.melange.tests.dispatch.main.l4.dispatchroot.DispatchrootPackage;
import fr.inria.diverse.melange.tests.dispatch.main.l4.dispatchroot.SubB;

public class Main {
public static void main(String[] args) {
		
		System.out.println("Test L1:");
		printL1();
		System.out.println("Test L2:");
		printL2();
		System.out.println("Test L3:");
		printL3();
		System.out.println("Test L4:");
		printL4();
		
	}
	
	public static void printL1(){
		L1Adapter adapter = new L1Adapter();
		fr.inria.diverse.melange.tests.dispatch.main.l1mt.dispatchroot.DispatchrootFactory factory = adapter.getDispatchrootFactory();
		fr.inria.diverse.melange.tests.dispatch.main.l1mt.dispatchroot.A a = factory.createA();
		fr.inria.diverse.melange.tests.dispatch.main.l1mt.dispatchroot.B b = factory.createB();
		fr.inria.diverse.melange.tests.dispatch.main.l1mt.dispatchroot.C c = factory.createC();
		
		transfo(a,b,c);
	}
	
	public static void printL2(){
		L2Adapter adapter = new L2Adapter();
		fr.inria.diverse.melange.tests.dispatch.main.l1mt.dispatchroot.DispatchrootFactory factory = adapter.getDispatchrootFactory();
		fr.inria.diverse.melange.tests.dispatch.main.l1mt.dispatchroot.A a = factory.createA();
		fr.inria.diverse.melange.tests.dispatch.main.l1mt.dispatchroot.B b = factory.createB();
		fr.inria.diverse.melange.tests.dispatch.main.l1mt.dispatchroot.C c = factory.createC();
		
		transfo(a,b,c);
	}
	
	public static void printL3(){
		L3Adapter adapter = new L3Adapter();
		fr.inria.diverse.melange.tests.dispatch.main.l1mt.dispatchroot.DispatchrootFactory factory = adapter.getDispatchrootFactory();
		fr.inria.diverse.melange.tests.dispatch.main.l1mt.dispatchroot.A a = factory.createA();
		fr.inria.diverse.melange.tests.dispatch.main.l1mt.dispatchroot.B b = factory.createB();
		fr.inria.diverse.melange.tests.dispatch.main.l1mt.dispatchroot.C c = factory.createC();
		
		transfo(a,b,c);
	}
	
	public static void printL4(){
		L4Adapter adapter = new L4Adapter();
		fr.inria.diverse.melange.tests.dispatch.main.l1mt.dispatchroot.DispatchrootFactory factory = adapter.getDispatchrootFactory();
		fr.inria.diverse.melange.tests.dispatch.main.l1mt.dispatchroot.A a = factory.createA();
		SubB subB = ((DispatchrootFactory)DispatchrootPackage.eINSTANCE.getEFactoryInstance()).createSubB();
		fr.inria.diverse.melange.tests.dispatch.main.l1mt.dispatchroot.B b = (B) fr.inria.diverse.melange.tests.dispatch.main.l4.adapters.l1mt.L1MTAdaptersFactory.getInstance().createAdapter(subB, null);
		fr.inria.diverse.melange.tests.dispatch.main.l1mt.dispatchroot.C c = factory.createC();
		
		transfo(a,b,c);
	}
	
	public static void transfo(
			fr.inria.diverse.melange.tests.dispatch.main.l1mt.dispatchroot.A a,
			fr.inria.diverse.melange.tests.dispatch.main.l1mt.dispatchroot.B b,
			fr.inria.diverse.melange.tests.dispatch.main.l1mt.dispatchroot.C c){
		//Direct calls
		a.foo();
		b.foo();
		//Indirect calls
		c.bar(a);
		c.bar(b);
	}
}

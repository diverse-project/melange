package fr.inria.diverse.k3.sle;

public class K3SLEStandaloneSetup extends K3SLEStandaloneSetupGenerated
{
	public static void doSetup() {
		new K3SLEStandaloneSetup().createInjectorAndDoEMFRegistration() ;
	}
}

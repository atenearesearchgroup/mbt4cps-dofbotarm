/*
 * generated by Xtext 2.20.0
 */
package lsi.us.es.mis.xtext;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class MyFamilyDslStandaloneSetup extends MyFamilyDslStandaloneSetupGenerated {

	public static void doSetup() {
		new MyFamilyDslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

/*
 * generated by Xtext 2.26.0
 */
package org.xtext;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class DofbotDSLStandaloneSetup extends DofbotDSLStandaloneSetupGenerated {

	public static void doSetup() {
		new DofbotDSLStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

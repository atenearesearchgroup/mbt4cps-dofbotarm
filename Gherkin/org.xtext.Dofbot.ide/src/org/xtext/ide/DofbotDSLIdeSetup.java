/*
 * generated by Xtext 2.26.0
 */
package org.xtext.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import org.xtext.DofbotDSLRuntimeModule;
import org.xtext.DofbotDSLStandaloneSetup;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class DofbotDSLIdeSetup extends DofbotDSLStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new DofbotDSLRuntimeModule(), new DofbotDSLIdeModule()));
	}
	
}

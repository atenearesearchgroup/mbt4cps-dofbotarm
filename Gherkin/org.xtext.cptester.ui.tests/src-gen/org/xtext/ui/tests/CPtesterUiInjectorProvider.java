/*
 * generated by Xtext 2.26.0
 */
package org.xtext.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import org.xtext.cptester.ui.internal.CptesterActivator;

public class CPtesterUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return CptesterActivator.getInstance().getInjector("org.xtext.CPtester");
	}

}
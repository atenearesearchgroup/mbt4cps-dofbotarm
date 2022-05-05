/*
 * generated by Xtext 2.26.0
 */
package org.xtext.example.mydsl.ui;

import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.xtext.example.mydsl.A.ui.internal.AActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class MyDslAExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return FrameworkUtil.getBundle(AActivator.class);
	}
	
	@Override
	protected Injector getInjector() {
		AActivator activator = AActivator.getInstance();
		return activator != null ? activator.getInjector(AActivator.ORG_XTEXT_EXAMPLE_MYDSL_MYDSLA) : null;
	}

}

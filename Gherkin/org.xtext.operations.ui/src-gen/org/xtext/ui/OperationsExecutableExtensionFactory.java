/*
 * generated by Xtext 2.26.0
 */
package org.xtext.ui;

import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.xtext.operations.ui.internal.OperationsActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class OperationsExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return FrameworkUtil.getBundle(OperationsActivator.class);
	}
	
	@Override
	protected Injector getInjector() {
		OperationsActivator activator = OperationsActivator.getInstance();
		return activator != null ? activator.getInjector(OperationsActivator.ORG_XTEXT_OPERATIONS) : null;
	}

}

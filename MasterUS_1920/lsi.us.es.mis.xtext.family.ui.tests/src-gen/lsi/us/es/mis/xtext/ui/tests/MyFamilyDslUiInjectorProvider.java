/*
 * generated by Xtext 2.21.0
 */
package lsi.us.es.mis.xtext.ui.tests;

import com.google.inject.Injector;
import lsi.us.es.mis.xtext.family.ui.internal.FamilyActivator;
import org.eclipse.xtext.testing.IInjectorProvider;

public class MyFamilyDslUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return FamilyActivator.getInstance().getInjector("lsi.us.es.mis.xtext.MyFamilyDsl");
	}

}
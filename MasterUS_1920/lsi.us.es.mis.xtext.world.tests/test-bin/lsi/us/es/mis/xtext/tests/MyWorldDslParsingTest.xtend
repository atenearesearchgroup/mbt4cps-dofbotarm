/*
 * generated by Xtext 2.20.0
 */
package lsi.us.es.mis.xtext.tests

import com.google.inject.Inject
import lsi.us.es.mis.xtext.myWorldDsl.World
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith

@ExtendWith(InjectionExtension)
@InjectWith(MyWorldDslInjectorProvider)
class MyWorldDslParsingTest {
	@Inject
	ParseHelper<World> parseHelper
	
	@Test
	def void loadModel() {
		val result = parseHelper.parse('''
			Hello Xtext!
		''')
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: �errors.join(", ")�''')
	}
}

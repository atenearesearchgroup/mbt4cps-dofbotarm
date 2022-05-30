/**
 * generated by Xtext 2.26.0
 */
package org.xtext.generator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.xtext.cPTester.Scenario;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class PruebaMainGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    String _className = this.className(resource);
    String _plus = (_className + ".txt");
    EObject _head = IterableExtensions.<EObject>head(resource.getContents());
    fsa.generateFile(_plus, 
      this.toCode(((Scenario) _head)));
  }
  
  public CharSequence toCode(final Scenario scenario) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field conditions is undefined for the type EList<And>"
      + "\nThe method or field conditions is undefined for the type EList<And>"
      + "\nThe method or field solution is undefined for the type EList<And>"
      + "\nname cannot be resolved"
      + "\ntime cannot be resolved"
      + "\neClass cannot be resolved"
      + "\nname cannot be resolved"
      + "\nequals cannot be resolved"
      + "\neClass cannot be resolved"
      + "\nname cannot be resolved"
      + "\neClass cannot be resolved"
      + "\nname cannot be resolved"
      + "\nequals cannot be resolved"
      + "\neClass cannot be resolved"
      + "\nname cannot be resolved");
  }
  
  public String className(final Resource res) {
    String name = res.getURI().lastSegment();
    return name.substring(0, name.indexOf("."));
  }
}

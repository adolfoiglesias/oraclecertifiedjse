/**
 * 
 */
package chapter4.nestedclasses.types.staticnested;

/**
 * @author Adolfo Miguel Iglesias
 *
 */
public interface Outer3 {
	
	// Esta clase es estaitca por defecto por estar dentr de una interfaz.
	// No es necesario ponerle el static.
	// No da error si ponigo static
	
	 class Inner{
		
	}
	 
	 // unla clase anidada puede ser declarada como abstracta, puede heredar de otras clases o implementar una interfaz
	 
	 abstract class Inner2 extends Outer3.Inner implements Outer4.Inner{
		 
	 }

}



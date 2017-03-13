/**
 * 
 */
package chapter4.nestedclasses.types.staticnested;

/**
 * @author Adolfo Miguel Iglesias
 *
 */
public interface Outer4 {
	
	 interface Inner{}
	
	//Esta clase es estaitca por defecto por estar dentr de una interfaz
		// No es necesario ponerle el static.
		// NO da error si lo pongo
	 abstract class Inner2{
		 
	 }

}

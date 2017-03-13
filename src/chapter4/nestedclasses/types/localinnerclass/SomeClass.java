/**
 * 
 */
package chapter4.nestedclasses.types.localinnerclass;

/**
 * @author Adolfo Miguel Iglesias
 *
 */
public class SomeClass {
	
	private String name;
	
	public void someFunction(){
		
		//Local class en el metodo
		class LocalClass{
			
			public void doSomething(){
				System.out.println(name);
				
			}
		}
	}
	
	// Local class en el constructor
	public SomeClass(final String name) {
		this.name = name;
		
		class LocalClass{
			final double amount = 10d; // si se peude declaar varibales finales
			
			public void method(){ // solo variables final
				System.out.println(name);
			}
		}
		
		LocalClass class1  = new LocalClass();
		System.out.println(class1.amount); // se peudeo acceder a los atributos de la clase anidada
		
		class1.method();
	
	}
	
	/*public void otherMethod(){
		
		// No se puede declarar clases Locales estaticas
		static class LocalClass{
			
		}
		
		
	}
	
	public void otherMethod2(){
		
		
		class LocalClass2{
			
			static int age;  // No se peude declarar atributos staticos en Local Class
		}
		
		interface ILocalClass{ // No se peude declarar loca interfaz
			
		}
	}
*/
}

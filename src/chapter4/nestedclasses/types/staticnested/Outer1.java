/**
 * 
 */
package chapter4.nestedclasses.types.staticnested;

/**
 * @author Adolfo Miguel Iglesias
 *
 */
public class Outer1 {

	private String name; 
	String lastName;
	
	private static int position;
	
	static class Inner{
		static int mount = 1;
		private int age = 2;
		
		public void methodInner(){
			
			System.out.println(name); // no peudo acceder a atributos que no son static
			
			System.out.println(position);  //Si peudo acceder a atributos staticos
			
			
			// Puedo acceder a atributos privados de la clase de afuera a traves de un objeto
			Outer1 out = new Outer1();
			System.out.println(out.name);
			System.out.println(out.lastName);
			
			// Puedo acceder a atriutos estaticos de la clase de afuer
			System.out.println(Outer1.position);
		}
		
	}
	
	abstract class Inner2{
		 
	}
	
	
	public void method1(){
		System.out.println(Inner.mount);
		System.out.println(Inner.age); // no se puede acceder porque no es una variable estatica
		
		Inner inner = new Inner();
		System.out.println(inner.age); // Si peude acceder a la variable de la clase anidada una vez que se cree un objeto de ella
	}
}



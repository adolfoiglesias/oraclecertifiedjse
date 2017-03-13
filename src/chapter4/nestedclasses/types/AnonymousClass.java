/**
 * 
 */
package chapter4.nestedclasses.types;

/**
 * @author Adolfo Miguel Iglesias
 *
 */
public class AnonymousClass {

	public Object food(){
		
		return new ClassA(){
		
			public String toString() {
				// TODO Auto-generated method stub
				return "anonymous";
			}
		};
		
		
		
	}
}

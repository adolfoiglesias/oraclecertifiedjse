/**
 * 
 */
package chapter6.generics.genericmethod;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Adolfo Miguel Iglesias
 *
 */
public class UtilitiesTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(10);
		intList.add(20);
		System.out.println("The original list is: " + intList);
		
		
		Utilities.fill(intList, 100);
		System.out.println("The list after calling Utilities.fill() is: " + intList);
		
			
		
		Utilities u = new Utilities();
		u.noStaticFill(intList, 120d); // error de compilacion porque el infiere que debe ser de tipo Integer
		
		u.noStaticFill(intList, 120);
		
	}

}

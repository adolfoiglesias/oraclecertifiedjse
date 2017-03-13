/**
 * 
 */
package chapter6.generics.typesafety;

import java.util.Vector;

/**
 * @author Adolfo Miguel Iglesias
 *
 */
public class OldContainerTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Vector floatValues = new Vector();
		floatValues.add(10.0f);
		floatValues.add(100.0);
		
		for (int i = 0; i < floatValues.size(); i++) {
			System.out.println(floatValues.get(i));
		}
		
		/*
		 * RuntimeException 
		 * Exception in thread "main" 100.0 java.lang.ClassCastException: java.lang.Double cannot be cast to java.lang.Float
			at chapter6.generics.typesafety.OldContainerTest.main(OldContainerTest.java:27)
		 * */
		
		Float temp = (Float) floatValues.get(1);
		System.out.println(temp);

	}

}

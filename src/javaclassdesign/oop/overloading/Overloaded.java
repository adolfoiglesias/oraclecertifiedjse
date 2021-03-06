/**
 * 
 */
package javaclassdesign.oop.overloading;

/**
 * @author Adolfo Miguel Iglesias
 *
 */
public class Overloaded {

	public static void aMethod(int val) {
		System.out.println("int");
	}

	public static void aMethod(short val) {
		System.out.println("short");
	}

	public static void aMethod(Object val) {
		System.out.println("object");
	}

	public static void aMethod(String val) {
		System.out.println("string");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b = 9;
		aMethod(b);
		// first call
		
		aMethod(9);
		// second call
		
		Integer i = 9;
		aMethod(i);
		// third call
		
		aMethod("9");
		// fourth call

	}

}

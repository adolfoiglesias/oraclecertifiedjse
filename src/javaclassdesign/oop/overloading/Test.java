/**
 * 
 */
package javaclassdesign.oop.overloading;

/**
 * @author amich
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Compile time - polymofism
		Figure figure1 = new Figure();
		figure1.fillColor(121212l);
		figure1.fillColor("reee", "greee", "blue");
		
		
		
		System.out.println(new Circle());
		System.out.println(new Circle(50, 100));
		System.out.println(new Circle(25, 50, 5));
		
	}

}

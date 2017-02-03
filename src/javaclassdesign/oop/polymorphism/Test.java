/**
 * 
 */
package javaclassdesign.oop.polymorphism;

/**
 * @author amich
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Runtime - polymofism
		
		Figure figure1 = new Figure();
		Figure figure2 = new Circle();
		
		figure1.area();
		figure2.area();
		
		//Compile time - polymofism
		figure1 = new Figure();
		figure1.fillColor(121212l);
		figure1.fillColor("reee", "greee", "blue");
		
		

	}

}

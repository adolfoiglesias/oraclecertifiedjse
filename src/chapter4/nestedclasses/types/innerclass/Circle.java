/**
 * 
 */
package chapter4.nestedclasses.types.innerclass;

/**
 * @author Adolfo Miguel Iglesias
 *
 */
public class Circle {

	// define Point as an inner class within Circle class
	class Point {
		private int xPos;
		private int yPos;

		// you can provide constructor for an inner class like this
		public Point(int x, int y) {
			xPos = x;
			yPos = y;
			System.out.println(radius); //--> si se peude acceder a los atributos de la clase de afuera
		}

		// the inner class is like any other class - you can override methods
		// here
		public String toString() {
			return "(" + xPos + "," + yPos + ")";
		}
	}

	// make use of the inner class for
	private Point center;
	private int radius;

	public Circle(int x, int y, int r) {
		// note how to make use of
		center = this.new Point(x, y);  // Constructor de Inner class
		radius = r;
		
		System.out.println(xPos); // -> No se peude acceder a atributos de una inner class
		
	}

	public String toString() {
		System.out.println(center.xPos  + " " + center.yPos); // si se peude acceder a los atributos privados pero siempre a atraves de una objeto 
		return "mid point = " + center + " and radius = " + radius;
	}

	public static void main(String[] s) {
		System.out.println(new Circle(10, 10, 20));
	}
	// other methods such as area are elided

}

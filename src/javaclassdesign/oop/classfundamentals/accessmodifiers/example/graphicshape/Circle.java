/**
 * 
 */
package javaclassdesign.oop.classfundamentals.accessmodifiers.example.graphicshape;

/**
 * @author Adolfo Miguel Iglesias
 *
 */
public class Circle extends Shape{
	private int radius;	
	//private field
	
	public double area() {
		// access to private field radius inside the class
		System.out.println("area:"+3.14*radius*radius);
		return 2;
	}
	
	void fillColor() {
		System.out.println("color:" + color); //access to protected field, in subclass
		}

}

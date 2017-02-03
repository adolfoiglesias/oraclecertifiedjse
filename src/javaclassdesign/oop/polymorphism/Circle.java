/**
 * 
 */
package javaclassdesign.oop.polymorphism;

/**
 * @author Adolfo Miguel Iglesias
 *
 */
public class Circle extends Figure{
	
	

	/**
	 * "runtime-time polymorphism"
	 * metodo area mostradno el polimorfims clase Figure con clase Circle y Square : 
	 */
	
	@Override
	public double area() {
		System.out.println("Circle.area()");
		return 2;
	}

}

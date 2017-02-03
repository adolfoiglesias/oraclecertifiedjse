/**
 * 
 */
package javaclassdesign.oop.polymorphism;

/**
 * @author Adolfo Miguel Iglesias
 *
 */
public class Figure {
	
	
	/**
	 * "runtime-time polymorphism"
	 * metodo area mostradno el polimorfims clase Figure con clase Circle y Square : 
	 */
	
	public double area(){
		System.out.println("Figure.area()");
		return 1;
	}
	
	
	/**
	 * compile-time polymorphism
	 * metodo fillColor ejecuta polimorfims 
	 */
	
	public double fillColor(String red, String green, String blue){
		System.out.println("Figure.fillColor() parametros -> String red, String green, String blue");
		return 1;
	}
	
	public double fillColor(long hsb){
		System.out.println("Figure.fillColor() -> long hsb");
		return 1;
	}
	

}

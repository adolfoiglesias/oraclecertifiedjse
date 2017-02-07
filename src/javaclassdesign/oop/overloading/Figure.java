/**
 * 
 */
package javaclassdesign.oop.overloading;

/**
 * @author Adolfo Miguel Iglesias
 *
 */
public class Figure {
	
	
	/**
	 * Overloading : method overloading
	 * metodo fillColor ejecuta polimorfims 
	 */
	
	public double fillColor(String red, String green, String blue){
		System.out.println("Figure.fillColor() parametros -> String red, String green, String blue");
		return 1;
	}
	
	//Overloading : method overloading
	
	public double fillColor(long hsb){
		System.out.println("Figure.fillColor() -> long hsb");
		return 1;
	}
	

}

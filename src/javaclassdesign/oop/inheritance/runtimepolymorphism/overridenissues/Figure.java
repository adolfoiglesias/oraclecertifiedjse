/**
 * 
 */
package javaclassdesign.oop.inheritance.runtimepolymorphism.overridenissues;

import java.io.IOException;

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
	
	protected double areaInternal() throws IOException{
		System.out.println("Figure.areaInternal()");
		return 1;
	}

}

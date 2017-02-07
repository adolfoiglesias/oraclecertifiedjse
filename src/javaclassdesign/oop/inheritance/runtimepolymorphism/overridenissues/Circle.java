/**
 * 
 */
package javaclassdesign.oop.inheritance.runtimepolymorphism.overridenissues;

import java.io.IOException;

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
	
	// ERROR -> Should not have a more restrictive access modifier than the base version. 
	//          Cannot reduce the visibility of the inherited method from Figure
	/*
	@Override
	private double areaInternal(){ 
		
	}*/
	
	// Error --> should have the same argument list types (or compatible types) as the base version.
	/*@Override
	protected double areaInternal(String value){ 
		
	}*/
	
	
	/**
	 * Error --> Should not throw new or broader checked exceptions.But it may throw fewer or narrower checked exceptions, or any unchecked exception.
	 * 
	 * Multiple markers at this line
	- Exception Exception is not compatible with throws clause in Figure.areaInternal()
	- overrides 
	 javaclassdesign.oop.inheritance.runtimepolymorphism.overridenissues.Figure.areaInternal
	 */
	/*
	@Override
	protected double areaInternal() throws Exception {
		System.out.println("Circle.areaInternal()");
		return 2;
	}*/
	
	/**
	 * Exception -> But it may throw fewer or narrower checked exceptions, or any unchecked exception.
	 */
	
	@Override
	protected double areaInternal() throws RuntimeException {
		System.out.println("Circle.areaInternal()");
		return 2;
	}
	
	
	
	

}

/**
 * 
 */
package chapter5.interfacesabstract;

/**
 * @author Adolfo Miguel Iglesias
 *
 */
public abstract class Shape {
	
	abstract double area();
	private Shape parentShape;
	
	public void setParentShape(Shape shape) {
		parentShape = shape;
	}
	
	public Shape getParentShape() {
		return parentShape;
	}
	

}

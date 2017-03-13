/**
 * 
 */
package chapter5.interfacesabstract;

/**
 * @author Adolfo Miguel Iglesias
 *
 */
public class Rectangle extends Shape implements Rotable{
	
	private int length, height;
	
	@Override
	double area() {
		return length * height;
	}
	
	@Override
	public void rotate(float degree) {
		// TODO Auto-generated method stub
		
	}

}

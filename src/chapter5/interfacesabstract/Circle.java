/**
 * 
 */
package chapter5.interfacesabstract;

/**
 * @author Adolfo Miguel Iglesias
 *
 */
public class Circle extends Shape implements Rollable {

	private int xPos, yPos, radius;

	public Circle(int x, int y, int r) {
		xPos = x;
		yPos = y;
		radius = r;
	}

	@Override
	double area() {
		return Math.PI * radius * radius;
	}

	@Override
	public void roll(float degree) {
		// TODO Auto-generated method stub

	}

}

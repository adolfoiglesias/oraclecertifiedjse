/**
 * 
 */
package chapter13.notifywait.example1;

/**
 * @author Adolfo Miguel Iglesias
 *
 */
public class CoffeeShop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CoffeeMachine coffeeMachine = new CoffeeMachine();
		Waiter waiter = new Waiter();
		coffeeMachine.start();
		waiter.start();

	}

}

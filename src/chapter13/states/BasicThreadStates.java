/**
 * 
 */
package chapter13.states;

/**
 * @author Adolfo Miguel Iglesias
 *
 */
public class BasicThreadStates extends Thread{

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		Thread t = new Thread(new BasicThreadStates());
		System.out.println(String.format("After creating the Thread its state is %s", t.getState()));
		
		t.start();
		System.out.println(String.format("After starting the Thread its state is %s", t.getState()));
		
		t.join();
		System.out.println(String.format("After joining the Thread its state is %s", t.getState()));

	}

}

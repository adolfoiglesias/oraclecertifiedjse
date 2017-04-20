/**
 * 
 */
package chapter13.dataraces;

/**
 * @author Adolfo Miguel Iglesias
 *
 */
public class UseCounter implements Runnable {

	public void increment() {
		// increments the counter and prints the value
		// of the counter shared between threads
		Counter.count++;
		System.out.print(Counter.count + " ");
	}

	public void run() {
		increment();
		increment();
		increment();
	}
}

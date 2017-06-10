/**
 * 
 */
package chapter13.dataraces;

/**
 * @author Adolfo Miguel Iglesias
 *
 */
public class UseCounter implements Runnable {

	/* Version incorrecta
	 
	 public void increment() {
		// increments the counter and prints the value
		// of the counter shared between threads
		Counter.count++;
		System.out.print(Counter.count + " ");
	}
	*/
	/*  Version 1 buena
		public void increment() {
			// increments the counter and prints the value
			// of the counter shared between threads
			synchronized (this) {
				Counter.count++;
				System.out.print(Counter.count + " ");
			}
			
		}
		*/
	
	// Version 2 buena
	synchronized public void increment() {
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

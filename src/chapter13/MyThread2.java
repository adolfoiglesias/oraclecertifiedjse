/**
 * 
 */
package chapter13;

/**
 * @author Adolfo miguel Iglesias
 *
 */
public class MyThread2 implements Runnable{
	
	@Override
	public void run() {
		System.out.println(String.format("Nombre del thread  %s", Thread.currentThread().getName()));
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Thread t = new Thread(new MyThread2());
		t.start();
		System.out.println(String.format("Nombre del thread  %s", Thread.currentThread().getName()));

	}

}

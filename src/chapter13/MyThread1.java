/**
 * 
 */
package chapter13;

/**
 * @author Adolfo Miguel Iglesias
 *
 */
public class MyThread1 extends Thread{
	
	@Override
	public void run() {
		try {
			sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(String.format("Nombre del thread  %s", getName()));
	}
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		Thread t1 = new MyThread1();
		t1.start();
		System.out.println(String.format("Nombre del thread  %s", Thread.currentThread().getName()));
	}

}

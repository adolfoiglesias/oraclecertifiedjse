/**
 * 
 */
package chapter13.dataraces;


/**
 * @author Adolfo Miguel Iglesias
 *
 */
public class DataRace {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		UseCounter uc = new UseCounter();
		Thread t1 = new Thread(uc);
		Thread t2 = new Thread(uc);
		Thread t3 = new Thread(uc);
		
		t1.start();
		t2.start();
		t3.start();
		
		
	}

}

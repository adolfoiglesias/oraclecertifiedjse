/**
 * 
 */
package chapter5.designpatterns.singleton;

/**
 * @author Adolfo Miguel Iglesias
 *
 */
public class LoggerTest {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
	
		Logger logger1 = Logger.getInstance();
		logger1.log("logger 1");
		
		Logger logger2 = Logger.getInstance();
		logger2.log("logger 2");
		
		logger1.setLine(2);
		logger1.log("logger 1");
		logger2.log("logger 2");
		
		System.out.println(logger1);
		System.out.println(logger2);
		
		
		System.out.println("Probando con hilos de ejecucion");
		
		Process p1 = new Process();
		Process p2 = new Process();
		Process p3 = new Process();
		
		Thread t1 = new Thread(p1);
		
		t1.start();
		p1.setOtherLine(30);
		
		Thread t2 = new Thread(p2);
		t2.start();
		
		Thread t3 = new Thread(p3);
		t3.start();
		
		
	}

}

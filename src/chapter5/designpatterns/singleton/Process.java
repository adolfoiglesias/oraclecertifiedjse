/**
 * 
 */
package chapter5.designpatterns.singleton;

/**
 * @author Adolfo Migue Iglesias
 *
 */
public class Process implements Runnable {
	Logger logger;
	
	public Process(){
		this.logger = Logger.getInstance();
	}
	
	
	@Override
	public void run() {
		logger.log("Process executing...");
	}
	
	public void setOtherLine(int l){
		logger.setLine(l);
	}
	
	
}

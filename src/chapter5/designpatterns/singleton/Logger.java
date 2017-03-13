/**
 * 
 */
package chapter5.designpatterns.singleton;

/**
 * @author Adolfo Miguel Iglesias
 *
 */
public class Logger {
	
	private int line;
	
	private Logger(int line){
		this.line = line;
	}
	
	public static Logger logger;
	
	public static class LoggerHolder{
		public static Logger looger = new Logger(1);
	}
	
	public static Logger getInstance(){
		return LoggerHolder.looger;
	}
	
	public void log(String s){
		System.out.println("line " + this.line  + " msg :" + s);
	}

	public void setLine(int line) {
		this.line = line;
	}
	
	

}

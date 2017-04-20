/**
 * 
 */
package chapter12.format;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Adolfo Miguel Iglesias
 *
 */
public class CustomDatePatterns {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// patterns from simple to complex ones
		
		/* d is day (in month), M is month, y is year */
		String pattern1 = "dd-MM-yyyy";
		
		/* E is name of the day (in week), Y is year */
		String pattern2 = "d '('E')' MMM, YYYY";
		
		/* w is the week of the year */
		String pattern3 = "w'th week of' YYYY";
		
		/* E is day name in the week */
		String pattern4 = "EEEE, dd'th' MMMM, YYYY";
		
		String[] dateFormats = {pattern1, pattern2,pattern3, pattern4};
		
		
		Date today = new Date();
		System.out.println("Default format for the date is " + DateFormat.getDateInstance().format(today));
		
		
		for (String dateFormat : dateFormats) {
			System.out.printf("Date in pattern \"%s\" is %s %n", dateFormat,new SimpleDateFormat(dateFormat).format(today));
		}

	}

}

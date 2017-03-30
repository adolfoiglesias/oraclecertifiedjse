/**
 * 
 */
package chapter12.bundle;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @author amich
 *
 */
public class LocalizedHello2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// print the largest box-office hit movie for default (US) locale
		Locale locale = Locale.getDefault();
		printMovieDetails(ResourceBundle.getBundle("chapter12.bundle.ResBundle", locale));
		
		// print the largest box-office hit movie for Italian locale
		locale = new Locale("it", "IT", "");
		printMovieDetails(ResourceBundle.getBundle("chapter12.bundle.ResBundle", locale));

	}

	public static void printMovieDetails(ResourceBundle resBundle) {
		String movieName = resBundle.getString("MovieName");
		Long revenue = (Long) (resBundle.getObject("GrossRevenue"));
		Integer year = (Integer) resBundle.getObject("Year");

		System.out.println("Movie " + movieName + "(" + year + ")" + " grossed " + revenue);
	}

}

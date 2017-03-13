/**
 * 
 */
package chapter7.regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author amich
 *
 */
public class Regex5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "Danny Doo, Flat no 502, Big Apartment, Wide Road, Near Huge Milestone,"
				+ " Hugo-city 56010, Ph: 9876543210, Email: danny@myworld.com. Maggi Myer, Post bag no 52, Big bank post"
				+ " office, Big bank city 56000, ph: 9876501234, Email: maggi07@myuniverse.com.";

		Pattern pattern = Pattern.compile("\\w+@\\w+\\.\\w{2,3}");//solo con 2 a 3 caracteres
		//Pattern pattern = Pattern.compile("\\w+@\\w+\\.\\w{3}"); //solo con 3 caracteres
		//Pattern pattern = Pattern.compile("\\w+@\\w+\\.com"); //solo .com
		
		
		Matcher matcher = pattern.matcher(str);
		while (matcher.find()) {
			System.out.println(matcher.group());
		}

	}
}

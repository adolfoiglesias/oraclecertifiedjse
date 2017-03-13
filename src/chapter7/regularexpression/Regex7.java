/**
 * 
 */
package chapter7.regularexpression;

import java.util.regex.Pattern;

/**
 * @author Adolfo Miguel Iglesias
 *
 */
public class Regex7 {

	void validateIP(String ipStr) {
		String regex = "\\b((25[0–5]|2[0–4]\\d|[01]?\\d\\d?)(\\.)){3}(25[0–5]|2[0–4]\\d|[01]?\\d\\d?)\\b";
		
		System.out.println(ipStr + " is valid? " + Pattern.matches(regex, ipStr));
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String ipStr1 = "255.245.188.123";
		// valid IP address
		String ipStr2 = "255.245.188.273";
		// invalid IP address - 273 is greater than 255
		Regex7 validator = new Regex7();
		validator.validateIP(ipStr1);
		validator.validateIP(ipStr2);

	}
}

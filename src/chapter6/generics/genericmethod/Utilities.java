/**
 * 
 */
package chapter6.generics.genericmethod;

import java.util.List;

/**
 * @author Adolfo Miguel Iglesias
 *
 */
public class Utilities {

	public static <T> void fill(List<T> list, T val) {
		for (int i = 0; i < list.size(); i++)
			list.set(i, val);
	}
	
	
	public <T> void noStaticFill(List<T> list, T val) {
		for (int i = 0; i < list.size(); i++)
			list.set(i, val);
	}


}

/**
 * 
 */
package chapter6.generics.wildcard;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Adolfo Miguel Iglesias
 *
 */
public class WildCardUse {

	//Metodo usando el wildcard
	static void printList(List<?> list) {
		for (Object l : list)
			System.out.println("[" + l + "]");
	}
	
		/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(100);
		
		printList(list);
		
		List<String> strList = new ArrayList<>();
		strList.add("10");
		strList.add("100");
		
		printList(strList);
		
		
		// linea usando el wildcard onde no se peude
		List<?> wildCardList = new ArrayList<Integer>();
		wildCardList.add(new Integer(10));  //--> metodo que soporta tipo de datos generico, por tanto el compilador trata de identificar el tipo de dato y en este caso es wildcard 
		System.out.println(wildCardList);

	}

}

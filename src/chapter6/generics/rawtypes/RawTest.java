/**
 * 
 */
package chapter6.generics.rawtypes;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Adolfo Miguel Iglesias
 *
 */
public class RawTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/**
		 * 1er ejemplo: Error de compilacion
		 * 
		 * 2do ejemplo: Error en tiempo de ejecucion
		 */
		
		/*
		The lesson is to avoid mixing raw types and generic types in your
		programs, since it might result in erroneous behavior at runtime. If you need to use both in a program, make sure you
		add a single type of items in the containers and retrieve using the same type.
		*/
		
		List list = new LinkedList();
		list.add("First");
		list.add("Second");
		List<String> strList = list;
		strList.add(10); // #1: generates compiler error
		
		for (Iterator<String> itemItr = strList.iterator(); itemItr.hasNext();)
			System.out.println("Item : " + itemItr.next());

		
		
		List<String> strList2 = new LinkedList<>();
		strList2.add("First");
		strList2.add("Second");
		List list2 = strList2;
		list2.add(10); // #2: compiles fine, results in runtime exception
		for (Iterator<String> itemItr = list2.iterator(); itemItr.hasNext();)
			System.out.println("Item : " + itemItr.next());

	}

}

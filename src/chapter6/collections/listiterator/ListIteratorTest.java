/**
 * 
 */
package chapter6.collections.listiterator;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * @author Adolfo Miguel Iglesias
 *
 */
public class ListIteratorTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String palStr = "abcba";
		List<Character> palindrome = new LinkedList<Character>();
		for (char ch : palStr.toCharArray())
			palindrome.add(ch);
		
		System.out.println("Input string is: " + palStr);
		
		ListIterator<Character> iterator = palindrome.listIterator();
		
		ListIterator<Character> revIterator = palindrome.listIterator(palindrome.size());
		
		boolean result = true;
		while (revIterator.hasPrevious() && iterator.hasNext()) {
			if (iterator.next() != revIterator.previous()) {
				result = false;
				break;
			}
		}
		if (result)
			System.out.print("Input string is a palindrome");
		else
			System.out.print("Input string is not a palindrome");
	}

}

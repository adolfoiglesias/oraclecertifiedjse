/**
 * 
 */
package chapter6.generics.wildcard;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Adolfo Miguel Iglesias
 *
 */
public class BoundedWildCardUse {

	public static Double sum(List<? extends Number> numList) {
		Double result = 0.0;
		for (Number num : numList) {
			result += num.doubleValue();
		}
		return result;
	}
	
	
	public static void doSomething(List<? super BigInteger> list, Number total){
		Integer s = new Integer(12);
		
		for (int i = 1; i <= total.intValue(); i++) {
	        list.add(total);
	    }
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<Integer>();
		List<Double> doubleList = new ArrayList<Double>();

		for (int i = 0; i < 5; i++) {
			intList.add(i);
			doubleList.add((double) (i * i));
		}
		System.out.println("The intList is: " + intList);
		System.out.println("The sum of elements in intList is: " + sum(intList));

		System.out.println("The doubleList is: " + doubleList);
		System.out.println("The sum of elements in doubleList is: " + sum(doubleList));
	}

}

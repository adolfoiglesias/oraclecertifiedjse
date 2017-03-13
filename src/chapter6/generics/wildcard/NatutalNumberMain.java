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
public class NatutalNumberMain {

	public static void doSomething(List<? extends NaturalNumber> list){
		for (NaturalNumber naturalNumber : list) {
			System.out.println(naturalNumber);
		}
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<EvenNumber> le = new ArrayList<>();
		
		List<? extends NaturalNumber> ln = le;
		//List<? extends NaturalNumber> ln = new ArrayList<NaturalNumber>();
		
		doSomething(ln);
		
		
		NaturalNumber x = new NaturalNumber(35);
		EvenNumber y = new EvenNumber(35);
		
		ln.add(x);  // compile-time error
		ln.add(y);  // compile-time error

	}

}

/**
 * 
 */
package chapter6.generics.generics;

/**
 * @author Adolfo Miguel Iglesias
 *
 */
public class BoxPrinter<T> {

	private T val;

	public BoxPrinter(T arg) {
		val = arg;
	}

	public String toString() {
		return "[" + val + "]";
	}

	public T getValue() {
		return val;
	}

}

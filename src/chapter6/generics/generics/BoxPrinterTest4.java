/**
 * 
 */
package chapter6.generics.generics;

/**
 * @author Adolfo Miguel Iglesias
 *
 */
public class BoxPrinterTest4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BoxPrinter<Integer> value1 = new BoxPrinter<Integer>(new Integer(10));
		
		System.out.println(value1);		
		Integer intValue1 = value1.getValue();

		
		// Diamond Syntax : No especificar el tipo de dato en la parte de derecha <>
		BoxPrinter<Integer> value3 = new BoxPrinter<>(new Integer(10));
		
		System.out.println(value1);		
		Integer intValue3 = value1.getValue();
		System.out.println(intValue3);

		
		
		
		
		BoxPrinter<String> value2 = new BoxPrinter<String>("Hello world");
		System.out.println(value2);
		
		
		// Ejemplo de type safe usando Genericidad
		
		// OOPs! by mistake, we did put String in an Integer
		Integer intValue2 = value2.getValue();
		String val2 = value2.getValue();
		System.out.println(val2);
		
		

	}

}

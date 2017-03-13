/**
 * 
 */
package chapter7.stringformatting;

import java.util.Calendar;

/**
 * @author Adolfo Miguel Iglesias
 *
 */
public class StringFormattingMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Estructura para formatear un String 
		//%[flags][width][.precision]datatype_specifier
		
		final String formatB = "%b"; // boolean
		final String formatC = "%c"; // caracter
		final String formatD = "%d"; // decimal formato signed
		
		final String formatE = "%e"; // floating number en forma cientifcia
		final String formatF = "%f";  // floating number en decimal format
		final String formatG = "%g"; // floating number en forma cientifica y decimal format
		
		final String formatH = "%h"; // hashcode
		final String formatN = "%n"; // separator de linea
		final String formatO = "%o"; // integer formateado en value octal
		final String formatS = "%s"; // string
		final String formatT = "%t"; // date time
		final String formatX = "%x"; // integer formateado en hexadecimal
		
		
		
		String res1 = null;
		String res2 = "Cualquier texto";
		System.out.printf(formatB, res1); // si el valor es null ent muestra falso
		System.out.printf(formatN);
		System.out.printf(formatB, res2); // cualquier valor que tenga ya es true
		System.out.printf("%15b", res2); // cualquier valor que tenga ya es true , aqui se colo 15 pixeles a la derecha
		
		System.out.printf(formatN);
		String character = "Probando texto para formatear";
		System.out.printf("%20s", character);
		
		System.out.printf(formatN);
		System.out.printf(formatH, res2);
		System.out.printf(formatN);
		System.out.printf("%h", character);
		
		System.out.printf(formatN);
		System.out.printf("%.3f", Math.PI);
		
		System.out.printf(formatN);
		
		
		// No entienod como uar el formateador de fechas
	/*	
		System.out.printf("%t", Calendar.getInstance().getTime());
	*/	
		Calendar cStartDate  = Calendar.getInstance();
		
		
		Calendar endDate  = (Calendar)cStartDate.clone();
		endDate.set(Calendar.MONTH, Calendar.APRIL);
		System.out.printf(" %1tF-%2tF", cStartDate.getTime(), endDate.getTime());
		
		

	}

}

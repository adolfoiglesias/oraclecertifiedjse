/**
 * 
 */
package chapter4.enumtypes;

/**
 * @author Adolfo Miguel Iglesias
 *
 */
public class EnumTest {

	PrinterType printerType;

	public EnumTest(PrinterType pType) {
		printerType = pType;
	}

	public void feature() {
		// switch based on the printer type passed in the constructor
		switch (printerType) {
		case DOTMATRIX:
			System.out
					.println("Dot-matrix printers are economical and almost obsolete");
			break;
		case INKJET:
			System.out.println("Inkjet printers provide decent quality prints");
			break;
		case LASER:
			System.out.println("Laser printers provide best quality prints");
			break;
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		EnumTest enumTest = new EnumTest(PrinterType.LASER);
		enumTest.feature();

	}

}

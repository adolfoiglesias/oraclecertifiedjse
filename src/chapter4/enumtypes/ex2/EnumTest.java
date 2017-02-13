/**
 * 
 */
package chapter4.enumtypes.ex2;

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
		switch (printerType) {
		
			case DOTMATRIX:
				System.out.println("Dot-matrix printers are economical");
				break;
			case INKJET:
				System.out.println("Inkjet printers provide decent quality prints");
				break;
			case LASER:
				System.out
						.println("Laser printers provide the best quality prints ");
				break;
		}
		System.out.println("Print page capacity per minute: "
				+ printerType.getPrintPageCapacity());
	}

	public static void main(String[] args) {
		EnumTest enumTest1 = new EnumTest(PrinterType.LASER);
		enumTest1.feature();
		EnumTest enumTest2 = new EnumTest(PrinterType.INKJET);
		enumTest2.feature();
	}
}

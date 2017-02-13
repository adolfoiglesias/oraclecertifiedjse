/**
 * 
 */
package chapter4.enumtypes.ex2;

/**
 * @author Adolfo Miguel Iglesias
 *
 */
public enum PrinterType {
	DOTMATRIX(5), INKJET(10), LASER(50);
	private int pagePrintCapacity;
	

	private PrinterType(int pagePrintCapacity) {
		this.pagePrintCapacity = pagePrintCapacity;
	}

	public int getPrintPageCapacity() {
		return pagePrintCapacity;
	}
}
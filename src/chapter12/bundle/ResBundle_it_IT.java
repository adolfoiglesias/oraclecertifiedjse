/**
 * 
 */
package chapter12.bundle;

import java.util.ListResourceBundle;
import chapter12.bundle.ResBundle;

/**
 * @author Adolfo Miguel Iglesias
 *
 */
public class ResBundle_it_IT extends ListResourceBundle{
	
	@Override
	protected Object[][] getContents() {
		// TODO Auto-generated method stub
		return contents;
	}
	
	static final Object[][] contents = {
		{ "MovieName", "Che Bella Giornata" },
		{ "GrossRevenue", (Long) 43000000L }, // in euros
		{ "Year", (Integer)2011 }
		};
	
	

}

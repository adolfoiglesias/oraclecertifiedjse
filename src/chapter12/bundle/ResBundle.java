/**
 * 
 */
package chapter12.bundle;

import java.util.ListResourceBundle;

/**
 * @author Adolfo Miguel Iglesias
 *
 */
public class ResBundle extends ListResourceBundle {

	@Override
	protected Object[][] getContents() {
		// TODO Auto-generated method stub
		return contents;
	}

	static final Object[][] contents = {{ "MovieName", "Avatar" },{ "GrossRevenue", (Long) 2782275172L }, // in US dollars
			{ "Year", (Integer) 2009 } 
	};

}

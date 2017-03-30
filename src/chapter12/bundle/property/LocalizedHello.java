/**
 * 
 */
package chapter12.bundle.property;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @author Adolfo Miguel Iglesias
 *
 */
public class LocalizedHello {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Locale.setDefault(new Locale("es", "MX"));
		
		Locale.setDefault(Locale.CANADA);
		
		
		ResourceBundle resBundle = ResourceBundle.getBundle("chapter12.bundle.property.ResourceBundle",Locale.getDefault());
		System.out.printf(resBundle.getString("greeting"));
		
		
		resBundle = ResourceBundle.getBundle("chapter12.bundle.property.ResourceBundle",Locale.getDefault(),new ResourceBundle.Control(){
			
			@Override
			public List<Locale> getCandidateLocales(String baseName,
					Locale locale) {
				
				if(baseName == null){
					throw new NullPointerException();
				}
				
				if (locale.equals(new Locale("es", "MX"))) {
				    return Arrays.asList(locale,Locale.ROOT);
				    
				} else {
				    return Arrays.asList(locale,Locale.ROOT);
				}
			}
		});
		
		System.out.printf(resBundle.getString("greeting"));
	}

}

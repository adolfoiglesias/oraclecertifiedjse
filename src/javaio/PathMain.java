/**
 * 
 */
package javaio;

import java.nio.file.Path;
import java.util.stream.Stream;

/**
 * @author Adolfo Miguel Iglesias
 *
 */
public class PathMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Path file1 = Path.of("/", 
					"etc", "javajse", "example", "files", "path", "file1.txt");
		
		Path parentFolder = file1.getParent();
		System.out.println("fileName " + file1.getFileName());
		System.out.println("Parent folder " + parentFolder);
		
		Path currentFolder = Path.of(".");
		currentFolder = currentFolder.normalize();
		System.out.println("Current folder " + currentFolder.getFileName());
		System.out.println("Current folder path "  + currentFolder);
		
		Path textFile = Path.of(".", "test", "text.txt");
		System.out.println("usando reative position -> Text.txt " + textFile);
		textFile =  textFile.normalize();
		System.out.println("normalizado el paht TextFile variable " + textFile);
		textFile =  textFile.toAbsolutePath();
		System.out.println("asbolute paht del TextFile variable " + textFile);
		
		// ------------------- Navigating
		Path acmeFile = parentFolder.resolve("../otherPath/acme.jpg");
		System.out.println("usando .. obteniendo acme file " + acmeFile);
		
		// -------------------- se obtiene un file hermano
		Path otherFile = file1.resolveSibling("file2.txt");
		
		
		
		// ---------------- si le pide el pahtaboslute obviando te lo da
		Path normalisedAcmeFile = acmeFile.normalize();
		System.out.println("normalisedAcmeFile " + normalisedAcmeFile);
		
		
		//  --------------lanza exception porque analiza si existe o no el path
		//Path verifiedPath = acmeFile.toRealPath();
		
		// -------------------- coloca el arhivo en una posicion relativa
		Path betweenSomePath = file1.relativize(acmeFile);
		System.out.println("BetweenSomePath "+ betweenSomePath);
		betweenSomePath = betweenSomePath.toAbsolutePath();
		System.out.println("BetweenSomePath "+ betweenSomePath);
		
		
		
		

	}

}

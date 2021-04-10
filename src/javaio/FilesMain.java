/**
 * 
 */
package javaio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * @author amich
 *
 */
public class FilesMain {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		Path file1 = Path.of(".", 
				"src", "javaio", "docs", "file1.txt");
	
		// ----------------------------------- Crea el directorio failla porque no se ha ceado el directorio
		/* 
		if(!Files.exists(file1)) {
			file1 = Files.createFile(file1);	
		}*/
		
		Path dirs = Path.of(".", "src", "javaio", "docs");
	
		// ----------------------------------- Crea el directorio y luego el archivo
		if(!Files.exists(dirs)) {
			Files.createDirectories(dirs);
			file1 = Files.createFile(file1);	
		}
	
		//navegando a traves de los directrios de una path
		for(int i = 0; i < file1.getNameCount(); i++ ) {
			System.out.println("file " + i + " - " + file1.getName(i));
		}
		
		// ------------------------------------ solo para pararte en directorio
		Path dir = file1.resolve("../..");
		dir = dir.normalize();
		
		// solo se puede ver la carpetas o file hijas directa
		System.out.println("count " + Files.list(dir).count());
		Files.list(dir).forEach(System.out::println);
		
		// ------------------ walk, camina toda la estrcutura hijas y subhijas
		Files.walk(dir).forEach(System.out::println);
		
	}

}

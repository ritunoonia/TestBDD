package sayHello;

import java.io.File;
import java.io.FileReader;

public class MyExceptions {

	public static void main(String[] args) {
         
		try {
			File file = new File("E://file.txt");
			FileReader fr = new FileReader(file);
		} catch(Throwable t) { 
			System.out.println("Failed to open the file" +t);
		}

	}

}

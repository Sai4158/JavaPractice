package textFilesInJava_p42;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ScannerClass {
	public static void main(String[] args) throws IOException {
		
		File filee = new File("./Sample.txt");
		
		//if files !doesn't exists create new file
		if(!filee.exists());
		System.out.println(filee.createNewFile());
		
		//FileInputStrean
		
		
		// new line
		System.out.println("");
		
		//this is how u Print using the While loop
		FileInputStream f =  new FileInputStream(filee);
		
		int ascicode;
		while (( ascicode = f.read())!= -1) {
			System.out.print((char)ascicode);
		}
		//.close will prevent data leaks 
		f.close();
		
	}

}

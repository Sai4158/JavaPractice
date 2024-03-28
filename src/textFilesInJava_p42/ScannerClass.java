package textFilesInJava_p42;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ScannerClass {
	public static void main(String[] args) throws IOException {
		
		File filee = new File("./Sample.txt");
		if(!filee.exists());
		System.out.println(filee.createNewFile());
		
		//way to read the file
		FileInputStream f =  new FileInputStream(filee);
		
		int ascicode;
		while (( ascicode = f.read())!= -1) {
			System.out.print((char)ascicode);
		}
		
		f.close();
		
	}

}

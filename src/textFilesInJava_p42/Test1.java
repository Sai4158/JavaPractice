package textFilesInJava_p42;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Test1 {
	public static void main(String[] args) throws IOException {
		//create new file
		File file = new File("./test1");
		file.createNewFile();
		
		
		//File input
		FileInputStream fir = new FileInputStream(file);
		
		//file read
		int asic;
		while((asic = fir.read()) !=-1) {
			System.out.print((char)asic);
		}
	}
}

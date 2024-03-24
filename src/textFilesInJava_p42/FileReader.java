package textFilesInJava_p42;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileReader {

	public static void main(String[] args) throws IOException {
	
		//file creation
		File file = new File("./Sample.txt");
		if(!file.exists());
		System.out.println(file.createNewFile());
		
		//using file reader method (Easy)
		FileReader fr = new FileReader();
		int print;
		while((print = fr.read()) !=-1) {
			System.out.print((char)print);
		}
		
		
		//practice again 
		FileReader frr = new FileReader(file);
		int pin;
		while((pin =  fr.read())!=-1) {
			System.out.print((char)pin);
		}
		
		
	}

}

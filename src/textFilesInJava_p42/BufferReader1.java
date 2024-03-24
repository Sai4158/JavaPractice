package textFilesInJava_p42;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class BufferReader1 {
	public static void main(String[] args) throws IOException {
		
		//file creation
		File file = new File("./Sample2.txt");
		if(!file.exists())
		file.createNewFile();
		
		FileReader fr =  new FileReader(file);
		
		//Read Using the Buffered Reader 
		BufferedReader brr = new BufferedReader(fr);
		
		int print;
		while ((print = brr.read())!=-1) {
			System.out.print((char)print);
		}
		
		//close the scanners
		fr.close();
		brr.close();
	}

}

package textFilesInJava_p42;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Program1 {
	public static void main(String[] args) throws IOException {
		
		//file creation
		File file = new File("./Sample.txt");
		
		//if files !doesn't exists create new file
		if(!file.exists());
		System.out.println(file.createNewFile());
		
		//Scanner Way to read the file 
		Scanner scan = new Scanner(file);
		
		//has next will check all lines in the text file A
			while (scan.hasNextLine()) {
				System.out.println(scan.nextLine());
			}
		
		//close the Scanner
		scan.close();
	}

}

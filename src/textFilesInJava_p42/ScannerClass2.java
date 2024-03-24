package textFilesInJava_p42;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ScannerClass2 {
	public static void main(String[] args) throws IOException {
		
		File f = new File("./Scanner2.txt");
		
		if(!f.exists()) {
			System.out.println(f.createNewFile());
		}
		
		Scanner scan = new Scanner(f);
		
		//has next here
		while(scan.hasNextLine()) {
			//make sure it has next line
			System.out.println(scan.nextLine());
		}
		
	}

}

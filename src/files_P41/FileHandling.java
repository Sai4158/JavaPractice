package files_P41;

import java.io.File;
import java.io.IOException;

public class FileHandling {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\saira\\OneDrive - The Pennsylvania State University\\Whiteboards\\resume.txt");
		
		// new file
		System.out.println(f.createNewFile());
		
		//deletes the file
		System.out.println(f.delete());
		
		//check the file if its exists or not
		System.out.println(f.exists());
		
		//check the file if u can over right 
		System.out.println(f.canWrite());
		//set writable to true 
		f.setWritable(true);
		
	}
}

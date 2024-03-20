package files_P41;

import java.io.File;
import java.util.Arrays;
import java.util.Date;

public class Test1 {
	public static void main(String[] args) {
		File g = new File("\\Downloads\\hi.txt");
		
		//Creates a folder 
		System.out.println(g.mkdir());
		
		//will list the file path
		System.out.println(Arrays.toString(g.list()));
		
		//will get the name of the file
		System.out.println(g.getName());
				
		//will get the path
		System.out.println(g.getAbsolutePath());
		
		//will get the date of the file
		System.out.println(new Date(g.lastModified()));
	}

}

package properties_files_p53;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropPractice2 {
	public static void main(String[] args) throws IOException {

		File abc  = new File("db.config2.propertiess");

		if(!abc.exists()) {
			abc.createNewFile();
		}

		System.out.print(abc.exists());

		//storing data to the prop file 
		//this is how to put the data in the file 
		Properties prop = new Properties();
		prop.setProperty("urls","local Host");
		
		FileOutputStream fos = new FileOutputStream(abc);

		//this is how to send the data to the file 
		//save method 
		prop.store(fos, "New prop file is created");
	}
}

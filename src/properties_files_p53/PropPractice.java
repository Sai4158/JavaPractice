package properties_files_p53;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class PropPractice {
	public static void main(String[] args) throws IOException {
		File file =  new File("db.config.properties");

		//this is how you create a file 
		if(!file.exists()) {
			//also create exception 
			file.createNewFile();
		}
		
		
		//to check if the file exsits or not 
		System.out.print(file.exists());
		
		
		
		//this is how you add the properties 
		// this is key value pair
		Properties prop = new Properties();
		prop.setProperty("url","local Host");
		prop.setProperty("username","sai41");
		prop.setProperty("password","hyr123");
	

		
		//this is how to put the data in the file 

		FileOutputStream fos = new FileOutputStream(file);
		
		//this is how to send the data to the file 
		//save method 
		prop.store(fos, "New prop file is created");
		
		System.out.println();
		//this is how you can read the data from the file 
		//keys cannot be duplicated
		
		//you can do it using the set method.
		
		FileInputStream fis = new FileInputStream(file);
		prop.load(fis);
		
		Set <String> keys = prop.stringPropertyNames();
		System.out.println(keys);
	}
}

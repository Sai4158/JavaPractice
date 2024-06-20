package properties_files_p53;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collection;
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

		
		//this is how you update a value 
		prop.setProperty("password","saiiiiii");
		prop.remove("password");



		//this is how to put the data in the file 

		FileOutputStream fos = new FileOutputStream(file);

		//this is how to send the data to the file 
		//save method 
		prop.store(fos, "New prop file is created");

		System.out.println();
		//this is how you can read the data from the file 
		//keys cannot be duplicated

		
		//first the load the data from the file
		FileInputStream fis = new FileInputStream(file);
		prop.load(fis);

		//print key 
		Set <Object> keys = prop.keySet();
		System.out.println(keys);

		//print values
		Collection<Object> c = prop.values();
		System.out.println(c);

		//will get custom value
		System.out.println(prop.getProperty("username"));
		//sai41
		
		System.out.println("------------------");
		
		
		//using foreach to print the keys
		//priting key and value, make sure to use String for the value
		for(Object keys1 : prop.keySet()) {
			System.out.println(keys1 + ">>>>" + prop.getProperty((String)keys1));
		}
	}
}

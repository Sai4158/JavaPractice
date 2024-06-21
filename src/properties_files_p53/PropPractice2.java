package properties_files_p53;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class PropPractice2 {
	public static void main(String[] args) throws IOException {

		File abc  = new File("db.config2.propertiess");

		if(!abc.exists()) {
			abc.createNewFile();
		}

		System.out.print(abc.exists());

		//storing data to the prop file 
		//this is how to put the data in the file 
		Properties prop1 = new Properties();
		prop1.setProperty("urls","local Host");
		
		FileOutputStream storeData = new FileOutputStream(abc);

		//this is how to send the data to the file 
		//save method 
		prop1.store(storeData, "Storing data");
		
		//printing using keys 
		Set <Object> keys = prop1.keySet();
		System.err.println(keys);
		
		//will print the values 
		Collection<Object> values =  prop1.values();
		System.out.println(values);
	}
}

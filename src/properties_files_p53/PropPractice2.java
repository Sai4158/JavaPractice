package properties_files_p53;

import java.io.File;
import java.io.IOException;

public class PropPractice2 {
	public static void main(String[] args) throws IOException {
		
		File abc  = new File("db.config2.propertiess");
		
		if(!abc.exists()) {
			abc.createNewFile();
		}
		
		System.out.print(abc.exists());

	}
}

package textFilesInJava_p42;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import javax.imageio.stream.FileCacheImageOutputStream;

public class Program5 {
	public static void main(String[] args) throws IOException {
		//file creation 
		File file = new File("./Sample11.txt");
		if(!file.exists());
		file.createNewFile();
		
		//file output stream 
		FileOutputStream fos = new FileOutputStream(file);
		
		//this will print hello in ASCI code
		fos.write(72);
		fos.write(69);
		fos.write(76);
		fos.write(76);
		fos.write(79);
		
	}

}

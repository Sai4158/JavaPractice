package exception_P43;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Program1 {
    public static void main(String[] args) {
        File file = new File("./sample.txt");
        if (!file.exists()) {
        	
            try {
                file.createNewFile();
            } 
            
            catch (IOException e) {
                e.printStackTrace();
                return; 
            }
            
        }

        try (FileReader fr = new FileReader(file);
             BufferedReader br = new BufferedReader(fr)) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

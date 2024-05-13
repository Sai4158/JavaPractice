package map_p50;
import java.util.*;

public class M1 {
	public static void main(String[] args) {
			
		  //this is how to create a map
		  Map <Integer, String> m = new Hashtable<>();
		  
		  //add them first
		  m.put(101, "hyd");
		  m.put(102, "dhl");
		  m.put(103, "TS");

		  //this how you print it 
		  Collection<String> values = m.values();
		  for(String value:values) {
			  System.out.println(value);
		  }
	}
}

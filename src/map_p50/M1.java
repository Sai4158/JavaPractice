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

		//this will print the pair
		//using.values()
		Collection<String> values1 = m.values();
		for(String s: values1) {
			System.out.println(s);
		}
		
		System.out.println();
		
		//this will print the key
		//using.keySet()
		Set<Integer> keys = m.keySet();
		for(Integer i : keys) {
			System.out.println(i);
		}
		
		//this will print all the keys in array format
		System.out.println(m);
		
		//this will print by the key 
		System.out.println(m.get(101));
		
		//this will print both key and pair 
		Set<Integer> keys1 = m.keySet();
		for(Integer i : keys1) {
			System.out.println(i + " >>>> " + m.get(i));
		}
	}
}


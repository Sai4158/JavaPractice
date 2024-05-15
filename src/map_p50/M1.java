package map_p50;
import java.io.ObjectInputStream.GetField;
import java.util.*;

public class M1 {
	public static void main(String[] args) {

		//this is how to create a map
		//or u can uuse hashmap
		Map <Integer, String> m = new HashMap<>();
		Map<String, Integer> m1 =  new HashMap<>();
		
		//add them first to m 
		m.put(101, "hyd");
		m.put(102, "dhl");
		m.put(103, "TS");
		
		//add to m1
		m1.put("hi", 1);
		m1.put("hello", 2);
		m1.put("wassup", 3);
		
		//print out m1
		System.out.println(m1);
		
		//printing out m2
		Set<String> s1 = m1.keySet();
		for(String s : s1) {
			System.out.println(s + m1.get(s));
		}
	
		//printing out m2
				Set<String> s11 = m1.keySet();
				for(String s : s11) {
					System.out.println(s + ">>>>>>>" +  m1.get(s));
				}

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
		
		//this is how to delete 
		m.remove(102);
		System.out.println(m);
		
		//check if it contains 
		System.out.println(m.containsKey(102));
		System.out.println(m.containsValue("hyd"));
		
		//Replace
		System.out.println(m);
		m.replace(101, "Hyderbad");
		System.out.println(m);
		
		//Will print map size
		System.out.println(m.size());
		
		//will clear the list 
		m.clear();
		System.out.println(m);
	}
}


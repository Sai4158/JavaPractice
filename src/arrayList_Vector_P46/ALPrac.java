package arrayList_Vector_P46;

import java.util.*;

public class ALPrac {
	public static void main(String[] args) {
		
		//vector
		Vector v1 = new Vector();
		
		//add vectors 
		v1.add("sai");
		v1.add("nihar");
		
		//index(0 = first index), name 
		v1.add("raj");
		v1.add("raj1");
		v1.add(1,"raj2");
		v1.add("raj3");
		v1.add("raj4");
		v1.add("raj5");
		v1.add("raj6");
		v1.add("raj7");
		v1.add("raj8");
		
		
		//easy to print in collections 
		System.out.println(v1 + "\n");
				
			
		Vector v2 = new Vector();

		v2.add("v2");
		v2.add("v22");
		v2.add("v222");
		v2.add("v2222");
		v2.add("v22222");
		
		//this will add v1 to v2
		//will combine both vector arrays using size()
		//add v1.add(v2.get(i))
		for(int i = 0; i<v2.size(); i++) {
			v1.add(v2.get(i));
		}
		
		//this is best to way to add 
		v1.addAll(v2);
		
		
		//this will remove all added values from the
		v1.removeAll(v2);
		
		
		//print the for loop combined 
		System.out.println(v1);
		
		//this will get the index at v1
		//using the get method
		System.out.println(v1.get(5));
		
		//this is how you remove from index 
		v1.remove(0);
		
	
		//this will print the .size and .capacity
		//\n for new line
		System.out.println("\n"+"size: "+v1.size());
		System.out.println("capacity: "+v1.capacity());
		
		
		
		
		// check if it has or no using the boolean value 
		System.out.println(v1.contains(v2));
		
		
		//delete everything nothing will be shown 
		v1.clear();
		System.out.println(v1);
	}

}

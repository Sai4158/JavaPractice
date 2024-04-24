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
		
		//this will print it 5 times using the for loop
		for (int i = 0; i < 5; i++) {
			System.out.println(v2);
		}
		
		System.out.println("\n"+"size: "+v1.size());
		System.out.println("capacity: "+v1.capacity());
	}

}

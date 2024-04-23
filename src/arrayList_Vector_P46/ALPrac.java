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
		v1.add(0,"raj");
		v1.add("raj1");
		v1.add("raj2");
		v1.add("raj3");
		v1.add("raj4");
		v1.add("raj5");
		v1.add("raj6");
		v1.add("raj7");
		v1.add("raj8");
		
		//easy to print in collections 
		System.out.println(v1);
		
		System.out.println("size: "+v1.size());
		System.out.println("capacity: "+v1.capacity());
	}

}

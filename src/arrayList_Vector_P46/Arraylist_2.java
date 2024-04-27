package arrayList_Vector_P46;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

import arrayCreation.Array;

public class Arraylist_2 {
	public static void main(String[] args) {
		
		Integer arr[] = {23,23,3,23,324,34343,43};
		//get it from a array using the aslist 
		ArrayList<Integer> al2 =  new ArrayList<>(Arrays.asList(arr));
		
		//add elements to it 
		al2.add(2);
		
		//this will get element index 
		System.out.println(al2.indexOf(2));
		//boolean will check it contains 
		System.out.println(al2.contains(al2));
		
		//set will change value at the index then new value 
		//at 0 index, set value to 34
		al2.set(0, 34);
		
		//
		//them print it out
		System.out.println(al2);
		
		//for loop
		for (int i = 0; i < al2.size(); i++) {
			System.out.print(al2.get(i) + "," );
		}
		System.out.println("\n");
		
		//for each 
		for (Integer integer : al2) {
			System.out.print(integer);

		}
		
		ArrayList<String> ab3 =  new ArrayList<>();
		ab3.add("Hello I am");
		
		System.out.println("\n"+ab3);

	}
}

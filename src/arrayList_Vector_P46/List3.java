package arrayList_Vector_P46;

import java.util.Vector;

public class List3 {
	public static void main(String[] args) {
		//this will only take Integer type of data
		//<Integer>
		Vector<Integer> v1 = new Vector<>();
		
		//this will print random numbers between 0 and 1000
        v1.add((int) (Math.random() * 1000));
        v1.add((int) (Math.random() * 1000));
        v1.add((int) (Math.random() * 1000));
		
		System.out.println(v1);

	}
}

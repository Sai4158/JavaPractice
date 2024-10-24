package collections;

import java.util.HashSet;

public class HashSet_recap {
	public static void main(String[] args) {

		HashSet<Integer> HS = new HashSet<>();

		int arr[] = {2,34,4,1,6,6};

		boolean re = false;

		
		for (int i = 0; i < arr.length; i++) {

			if(HS.contains(arr[i])) {
				re = true;
				break;
			}else {
				HS.add(arr[i]);
			}
		}

		System.out.println(re);

	}
}

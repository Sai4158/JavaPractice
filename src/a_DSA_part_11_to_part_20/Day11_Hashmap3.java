package a_DSA_part_11_to_part_20;

import java.util.HashMap;

public class Day11_Hashmap3 {
	public static void main(String[] args) {

		HashMap<Integer, Integer> has = new HashMap<>();
			int arr[] = {5,5,5,34,2,46,3,345,6};
			
		for (int i = 0; i < arr.length; i++) {
			int n = arr[i];
			
			if(has.containsKey(n)) {
				int prev = has.get(n);
				has.put(n,prev+1);
			}else {
				has.put(n,1);
			}
		}
		
		
//		For loop
		
		for(int boom :has.keySet()) {
			System.out.println(boom + " "+ has.get(boom));
		}
	}
}

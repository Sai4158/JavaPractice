package a_DSA_leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class _1331_Rank_Transform_of_an_Array {

	public static int[] arrayRankTransform(int[] arr) {
		
		int n = arr.length;
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		
		int sortedArray[] = arr.clone();
		Arrays.sort(sortedArray);
		int result[] = new int[n];
		int rank = 1;
		
		for(int num : sortedArray) {
			if(!hm.containsKey(num)) {
				hm.put(num, rank);
				rank++;
			}
		}
		
		for(int i = 0; i<n; i++) {
			arr[i] = hm.get(arr[i]);
		}
		
		return arr;
	}

	public static void main(String[] args) {
		int arr1[] = {40,10,20,30};
		System.out.println(arrayRankTransform(arr1)); 
	}
}

package a_DSA_part_31_to_part_40;

import java.util.Iterator;

public class Day342dArrayRecap {
	
	public static void main(String[] args) {
		
		
		int arr[][] = {{3,4,4},{4,4,6},{4,7,4}};
		
        int c = arr[0].length;
        
        
        for (int i = 0; i < arr.length; i++) {
            int a = c - i - 1; 
            System.out.println(arr[i][a]);
        }
		
	}
}

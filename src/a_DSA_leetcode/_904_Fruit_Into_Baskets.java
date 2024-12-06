package a_DSA_leetcode;

import java.util.HashMap;
import java.util.HashSet;

public class _904_Fruit_Into_Baskets {
	
	
	public static int totalFruit(int[] fruits) {
		
		int k = 0;
		int l = 0;
		int temp = 0;
		int ans = 0;
		
		int n  = fruits.length;
		
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		
		for (int r = 0; r < n; r++) {
			
			int val =  fruits[r];
//			Add values with count
			hm.put(val,hm.getOrDefault(val, 0)+1);
			
//			if hm size > 2 then remove lval
			while(hm.size()>2) {
				
				int lval = fruits[l];
				
				hm.put(lval, hm.get(lval)-1);
				
				if(hm.get(lval) == 0) {
					hm.remove(lval);
				}
				
				l++;
			}
			
			ans =  Math.max(ans, r-l+1);
			
			}
		return ans;
		}
    
	
	public static void main(String[] args) {
		
		int arr[] = {1,2,1};
		System.out.println(totalFruit(arr));
	}
}	

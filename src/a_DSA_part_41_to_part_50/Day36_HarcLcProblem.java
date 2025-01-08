package a_DSA_part_41_to_part_50;

import java.util.HashMap;

public class Day36_HarcLcProblem {
	
	   public static int atMostK(int[] nums, int k) {
		   int  l =0;
		   int ans  =0;
		   HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		   int temp =0;
		   
		   for (int r = 0; r < nums.length; r++) {
			int a = nums[r];
			
			hm.put(a, hm.getOrDefault(a,0)+1);
			
			while(hm.size() > k) {
				int b = nums[l];
				hm.put(b, hm.get(b)-1);
				
				if(hm.get(a)==0) {
					hm.remove(a);
				}
				
				l++;
			}
			
			ans += r-l+1;
		}
		   return ans;
	   }
	   
	    public static int subarraysWithKDistinct(int[] nums, int k) {
	    	return atMostK(nums, k) - atMostK(nums, k-1);
	    }
	
	
	public static void main(String[] args) {
		int nums[] = {1,2,1,2,3};
		int k =  2;
		
		System.out.println(subarraysWithKDistinct(nums, k));
	}
}

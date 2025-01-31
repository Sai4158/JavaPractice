package a_DSA_leetcode;

import java.util.HashMap;

public class _523_Continuous_Subarray_Sum {

	public static boolean checkSubarraySum(int[] nums, int k) {

		HashMap<Integer,Integer> map = new HashMap<>();
        long sum=0;
        map.put(0,-1); 

        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            int key = (int)sum%k;
            
            if(map.containsKey(key)){
                if(i-map.get(key)>1)
                    return true;
            }
            else
                map.put(key,i);
        }
        return false;
    }

	public static void main(String[] args) {

		int nums[] = {23,2,4,6,7};
		int k = 6;

		System.out.println(checkSubarraySum(nums, k));

	}
}

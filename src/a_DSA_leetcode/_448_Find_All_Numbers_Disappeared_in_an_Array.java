package a_DSA_leetcode;import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class _448_Find_All_Numbers_Disappeared_in_an_Array {

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        
    	List<Integer> ans  = new ArrayList<Integer>();
    	HashSet<Integer> hs = new HashSet<Integer>();
    	int n = nums.length;
    	Arrays.sort(nums);
    	
    	for (int i = 0; i < n; i++) {
			
    		hs.add(nums[i]);
    		
		}
    	
    	
    	for (int i = 1; i <= n; i++) {
			
    		if(!hs.contains(i)) {
    			ans.add(i);
    		}
    		
		}
    	
    	
    	return ans;
    	
    }
    
    public static void main(String[] args) {
		int nums[] = {4,3,2,7,8,2,3,1};
		System.out.println(findDisappearedNumbers(nums));
	}
	
}

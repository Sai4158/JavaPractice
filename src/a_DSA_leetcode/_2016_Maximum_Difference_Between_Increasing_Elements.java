package a_DSA_leetcode;

public class _2016_Maximum_Difference_Between_Increasing_Elements {
public static int maximumDifference(int[] nums) {
        
        int n =  nums.length;
        int ans =-1;

          for(int i =0; i<n; i++){
            for(int j =i+1; j<n; j++){
                if(nums[j]>nums[i]){
                    ans = Math.max(ans, nums[j]-nums[i]);
            }
        } 
    }  
            return ans;
  }


// Main method 
public static void main(String[] args) {
	int a[] = {4,34,54,5,45,6,46,45};
	System.out.println(maximumDifference(a));
	
	}
}




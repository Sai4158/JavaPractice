package a_DSA_leetcode;

import interface_p36.Lenovo;

public class _153_Find_Minimum_in_Rotated_Sorted_Array {
	
    public static int findMin(int[] nums) {

        int n =  nums.length;
        int l = 0;
        int r = n-1;

        while(l<r){
            int mid = l+(r-l)/2;

            if(nums[mid] < nums[r]){
                r = mid;
            }else{
                l = mid +1;
            }
        }
        return nums[l];
    }
	
	public static void main(String[] args) {
		
		int nums[] = {3,4,5,1,2};
		System.out.println(findMin(nums));
	} 
}

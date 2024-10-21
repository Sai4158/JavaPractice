package a_DSA_leetcode;

public class _26_Remove_Duplicates_from_Sorted_Array {
	public static int removeDuplicates(int[] nums) {
        
			int count = 1;
			
		      for (int i = 1; i < nums.length; i++) {
				if(nums[i] != nums[i-1]) {
					nums[count] = nums[i];
					count++;
				}
			}
		return count;	
    }
	public static void main(String[] args) {
		int arr[] = {43,44,2,1,3,45,62};
		
		System.out.println(removeDuplicates(arr));
	}
}

package a_DSA_leetcode;

public class _35_Search_Insert_Position {
	
	
    public static int searchInsert(int[] nums, int target) {
        
    	 int start = 0;
         int end = nums.length - 1;

         while(start <= end ){

             int mid = start + (end - start) / 2;

             if(nums[mid] == target){
                 return mid;
             }
             else if(target > nums[mid]){
                 start = mid + 1;
             }
             else{
                 end = mid - 1;
             }
         }
         
         return start;
 

    }
	
    
    
//    Main
	public static void main(String[] args) {
		int nums[] = {1,3,5,6};
		int target = 5;
		
		System.out.println(searchInsert(nums, target));
	}
}

package a_DSA_leetcode;

public class _1929_Concatenation_of_Array {
	  public static  int[] getConcatenation(int[] nums) {
	        
		  int n = nums.length;
		  
          int arr[] = new int [2*n];
		  	
          for (int i = 0; i < n; i++) {
			
        	   arr[i] = nums[i];
        	   arr[i + n] =  nums[i];
		}
          
          return arr;
	  }
	  
	  
	  //Main method 
	  public static void main(String[] args) {
		  	int arr[] = {1,2,3,4};
		  	
		  	System.out.println(getConcatenation(arr));
	}
}	

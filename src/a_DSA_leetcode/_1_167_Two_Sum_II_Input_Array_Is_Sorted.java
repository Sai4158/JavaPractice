package a_DSA_leetcode;

public class _1_167_Two_Sum_II_Input_Array_Is_Sorted {

	public static int[] twoSum(int[] numbers, int target) {
        int  n =  numbers.length; 
    	int l = 0;
    	int r = n - 1;
    	
    	while(l < r) {
    		
    		int ans =  numbers[l]+numbers[r];
    		
    		if(ans == target) {
      		  return new int[] {l + 1, r + 1};

    		}
    		
    		else if(ans > target) {
    			r--;
    		}
    		
    		else {
    			l++;
    		}
    	}
    	
    	return new int[0];
    	
    }
    
    public static void main(String[] args) {
		
    	int numbers[] = {2,7,11,15}, target = 9;
    	System.out.println(twoSum(numbers, target));
    	
	}
}

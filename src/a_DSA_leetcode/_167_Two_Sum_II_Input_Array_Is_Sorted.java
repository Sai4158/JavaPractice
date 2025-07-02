package a_DSA_leetcode;

public class _167_Two_Sum_II_Input_Array_Is_Sorted {
	
    public static int[] twoSum(int[] numbers, int target) {
        
    int  n =  numbers.length;
    
    int l = 0;
    int r = n -  1;
    
    while(l<r) {
    	
    	int sum  =  numbers[l] + numbers[r];
    	
    	if(sum ==  target) {
    		
    		  return new int[] {l + 1, r + 1};
    	}
    	
    	else if(sum < target) {
    		
    		l++;
    		
    		
    	}
    	
    	else {
    		r --;
    	}
    	
    }
    
    return new int[0];
    	
    }
	
	public static void main(String[] args) {
		int numbers[] = {2,7,11,15}, target = 9;
		System.out.println(twoSum(numbers, target));
	}
}

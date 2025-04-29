package a_DSA_leetcode;

public class _3232_Find_if_Digit_Game_Can_Be_Won {

    public static boolean canAliceWin(int[] nums) {
        
    	int n = nums.length;
    	
    	int singleCount = 0;
    	int doubleCount = 0;
    	
    	
    	for (int i = 0; i < n; i++) {
			if(nums[i] <= 9) {
				singleCount += nums[i];
			}else {
				doubleCount += nums[i];
			}
		}

    	int total = singleCount + doubleCount;
    	
    	
    	if(singleCount > doubleCount) {
    		return true;
    	}
    	if(doubleCount > singleCount) {
    		return true;
    	}
    	
    	
    	return false;
    }
	
	public static void main(String[] args) {
		
		int nums[] = {1,2,3,4,10};
		
		System.out.println(canAliceWin(nums));
		
	}
}

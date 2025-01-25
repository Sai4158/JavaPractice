package a_DSA_leetcode;

public class _55_Jump_Game {

    public static boolean canJump(int[] nums) {
        
        int a = 0;

        for(int i =0; i<nums.length; i++){
            if(i > a){
                return false;
            }

            a = Math.max(a, nums[i] + i);
        }
        return true;
    }
	
	public static void main(String[] args) {
//			2 + 0 = 2
//			2, 3 +1 = 4
//			4, 1+2 = 3
//			4, 1+3 = 4
//			4, 4 + 4 = 8
//			A = 8
			
		int[] nums1 = {2, 3, 1, 1, 4};
        System.out.println(canJump(nums1));
	}
}

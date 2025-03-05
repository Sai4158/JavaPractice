package a_DSA_part_51_to_part_60;

public class _1760MinimumLimitofBallsinaBag {

	public static int minimumSize(int[] nums, int maxOperations) {
		
		int l = 1;
		int r =  (int) Math.pow(10, 9);
		
		while(l<=r) {
			int  mid =  l+(r-l)/2;
			
			if(IsPossible(nums, maxOperations, mid)) {
				r =  mid -1;
			}else {
				l = mid+1;
			}
		}
		return l;
	}

	public static boolean IsPossible(int[] nums, int maxOperations, int k) {
		int count = 0;
		
		for (int i = 0; i < nums.length; i++) {
			
			if(nums[i] > k) {
				count += (nums[i]-1) /k;
				}
			
			if(count > maxOperations) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		 int[] nums1 = {9};
	        int maxOps1 = 2;
	        System.out.println(minimumSize(nums1, maxOps1));
	}
}

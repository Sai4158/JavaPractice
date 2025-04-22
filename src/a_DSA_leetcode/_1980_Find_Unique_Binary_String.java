package a_DSA_leetcode;

public class _1980_Find_Unique_Binary_String {

	public static  String findDifferentBinaryString(String[] nums) {

		int n =  nums.length;

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < n; i++) {

			sb.append(nums[i].charAt(i) == '0' ? '1' : '0');
		}

		return sb.toString();
	}

	public static void main(String[] args) {
		String[] nums1 = {"01", "10"};
		System.out.println(findDifferentBinaryString(nums1));
	}
}

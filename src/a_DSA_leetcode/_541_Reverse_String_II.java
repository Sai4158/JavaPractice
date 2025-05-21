package a_DSA_leetcode;

public class _541_Reverse_String_II {

	 public static String reverseStr(String s, int k) {

	        char[] arr = s.toCharArray();
	        int n = arr.length;

	        for (int i = 0; i < n; i += 2 * k) {
	        	
	            int l = i;
	            int r = Math.min(i + k - 1, n - 1);

	            while (l < r) {
	                char temp = arr[l];
	                arr[l] = arr[r];
	                arr[r] = temp;
	                l++;
	                r--;
	            }
	        }

	        return new String(arr);
	    }



	public static void main(String[] args) {
		String s = "abcdefg";
		int k = 2;
		System.out.println(reverseStr(s, 0));
	}
}

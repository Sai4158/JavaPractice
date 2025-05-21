package a_DSA_part_61_to_part_70;

public class Day70_ReverseStringTwoPointers {

	public static String reverseStr(String s, int k) {
		
		int n =  s.length();
        char[] arr = s.toCharArray();
		
        for (int i = 0; i < n; i+= 2 * k) {
			
        	int l = i;
        	int r =  Math.min(i+k-1, n-1);
        	
        	while(l<r) {
        		
        		char temp = arr[l];
        		arr[l] =  arr[r];
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
		System.out.println(reverseStr(s, k));
	}
}

package a_DSA_part_21_to_part_30;

public class Day21SlidingWindowArray {
	public static void main(String[] args) {
		
		String s  = "abcbabfbacbda";
		
		int n = s.length();
		
		int count = 0;
		
		for (int i = 0; i < n-2; i++) {
			
			char a = s.charAt(i);
			char b = s.charAt(i+1);
			char c = s.charAt(i+2);
			
			
			if(a!=b && b!=c && a!=c) {
				count++;
			}
		}
		
		System.out.println(count);
		
	}
}

package a_DSA_leetcode;

public class _868_Binary_Gap {

	public static int binaryGap(int n) {
				
		String  bit =  Integer.toBinaryString(n);
		
		int last = -1;
		int max = 0;
		
		for (int i = 0; i < bit.length(); i++) {
			
			char c =  bit.charAt(i);
			
			if(c == '1') {
				if(last != -1) {
					
					int gap = i - last;
					
					if(gap > last) {
						max =  gap;
					}
					
				}
				last = i;
			}
			
		}
		return max;
	}
	
	public static void main(String[] args) {
		System.out.println(binaryGap(22));
	}
}

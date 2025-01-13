package a_DSA_part_41_to_part_50;

public class Day37_greatestCharacterLessThanTarget {


	public static char greatestCharacterLessThanTarget(char[] chars, char target) {
		
		int n = chars.length;
		int l = 0;
		int r =  n-1;
		
		while (l<=r) {
			int mid =  l +  (r-l)/2;
			
			if(chars[mid] < target) {
				l = mid +1;
			}else {
				r = mid -1;
			}
			
			if(r <0) {
				return 'a';
			}
		}
		
		return chars[r];
		
	}


	public static void main(String[] args) {
		
		char chars[] = {'a','b','c','d','e'};
		char target = 'd';

		System.out.println(greatestCharacterLessThanTarget(chars, target));
	}
}

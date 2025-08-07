package a_DSA_part_71_to_part_80;

public class Day80_FindtheOriginalTypedStringI {

	public static int possibleStringCount(String word) {
		
		int count = 1;
		int ans = 1;
		
		int  n = word.length();
		
		for (int i = 1; i < n; i++) {
			
			if(word.charAt(i) == word.charAt(i-1)) {
				count++;
			}
			
			else {
				
				if(count > 1) {
					count +=  (ans -1);
				}
				
				ans = 1;
			}
		
		}
		
		if(ans > 1) {
			count += (ans-1);
		}
		
		
		return ans;
	}

	public static void main(String[] args) {
		String word = "abbcccc";
		System.out.println(possibleStringCount(word));
	}
}

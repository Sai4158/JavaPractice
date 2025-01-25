package a_DSA_leetcode;

public class _345_Reverse_Vowels_of_a_String {


	public static String reverseVowels(String s) {
		
		char all[] = s.toCharArray();
		int l = 0;
		int n = s.length();
		int r = n -1;
		
		while(l<r) {
			
			if(check(all[l])==false){
                l++;
            }
            else if(check(all[r])==false){
                r--;
            }
			
			else {
				
				char temp  = all[l];
				all[l] =  all[r];
				all[r] =  temp;
				
				l++;
				r--;
			}
			
		}
		
		return new String (all);
		
	}

	public static boolean check(char s) {
		if(s=='a'|| s=='e' || s=='i' || s=='o' || s=='u' || s=='A' ||s=='E' || s=='I' || s=='O' || s=='U'){
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		
		String s = "IceCreAm";
		System.out.println(reverseVowels(s));

	}
}

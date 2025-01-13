package a_DSA_leetcode;

public class _744_Find_Smallest_Letter_Greater_Than_Target {
    public static char nextGreatestLetter(char[] letters, char target) {
        
    	int n =  letters.length;
    	int l =0;
    	int r = n-1;
    	
    	 while (l <= r) {
             int mid = l + (r - l) / 2;
             
          if(letters[mid]> target) {
        	  r = mid -1;
          }else {
        	  l = mid +1;
          }
    	 }
    	return l < n ? letters[l] : letters[0];
    	
    }
    
    public static void main(String[] args) {
    	char chars[] = {'a','b','c','d','e'};
		char target = 'd';

		System.out.println(nextGreatestLetter(chars, target));
	}
}

package a_DSA_part_71_to_part_80;

public class Day80_FindTriangularSumofanArray {
	
	public static String makeSmallestPalindrome(String s) {
        
    	
    	 char[] c = s.toCharArray();
    	 int i = 0;
    	 int n =  s.length();
    	 int j = n - 1;
    	 
    	 while(i < j) {
    		 
    		 if(c[i] != c[j]) {
    			 
                 char m = (c[i] < c[j]) ? c[i] : c[j];
                 
                 c[i] =  m;
                 c[j]=  m;
    			 
    		 }
    		 
    		 i++;
    		 j--;
    		 
    	 }
    	 
    	 return new String(c);
    }
	
	public static void main(String[] args) {
		System.out.println(makeSmallestPalindrome("egcfe"));

	}
}

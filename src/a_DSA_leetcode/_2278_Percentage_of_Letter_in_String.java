package a_DSA_leetcode;

public class _2278_Percentage_of_Letter_in_String {

    public static int percentageLetter(String s, char letter) {
        
    	int n = s.length();
    	int count = 0;
    	
    	for (int i = 0; i < n; i++) {
			
    		if(s.charAt(i) == letter) {
    			count++;
    		}
		}
    	
    	return (count * 100)/n;
    }
	
	public static void main(String[] args) {
		
		String  s = "foobar";
		char letter = 'o';
		System.out.println(percentageLetter(s, letter));
		
	}
}

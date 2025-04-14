package a_DSA_leetcode;

public class _1880_Check_if_Word_Equals_Summation_of_Two_Words {
	
    public static boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
            	
    	int sum1 = 0;
    	int sum2 = 0;
    	int sum3 = 0;
    	
//    	for loops to fill all the values in it
    	for (int i = 0; i < firstWord.length(); i++) {
    		sum1 = sum1 * 10 + (firstWord.charAt(i) - 'a');
    	}
    	
    	for (int i = 0; i < secondWord.length(); i++) {
    		sum2 = sum2 * 10 + (secondWord.charAt(i) - 'a');
    	}
    	
    	for (int i = 0; i < targetWord.length(); i++) {
    		sum3 = sum3 * 10 + (targetWord.charAt(i) - 'a');
    	}
    	
    	return sum1 + sum2 == sum3;
    }
	
	
    public static void main(String[] args) {
		String firstWord = "acb";
		String secondWord = "cba";
		String targetWord = "cdb";
		
		System.out.println(isSumEqual(firstWord, secondWord, targetWord));  
	}
	
}

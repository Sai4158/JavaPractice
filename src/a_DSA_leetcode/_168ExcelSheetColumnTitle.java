package a_DSA_leetcode;

public class _168ExcelSheetColumnTitle {
	
    public static String convertToTitle(int columnNumber) {
        
    	String ans = "";
    	
    	while(columnNumber > 0) {
    		
    		columnNumber--;
    		
    		int rem = columnNumber % 26;
    		
    		char letter =  (char) ('A' + rem);
    		
    		ans =  letter +  ans;
    		
    		columnNumber  =  columnNumber / 26;
    		
    	}
    	
    	
    	return ans;
    }
	
	public static void main(String[] args) {
		  System.out.println(convertToTitle(1));   
	        System.out.println(convertToTitle(28));
	}
	
}

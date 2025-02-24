package a_DSA_leetcode;

public class _3280_Convert_Date_to_Binary {
	
    public static String convertDateToBinary(String date) {
        
    	String ans = "";
    	String temp = "";
    	
    	for (int i = 0; i < date.length(); i++) {
			
    		if(date.charAt(i) != '-') {
    			temp += date.charAt(i);
    		}else {
    			ans += Integer.toBinaryString(Integer.parseInt(temp)) + '-';
    			temp = "";
    		}
		}
    	ans += Integer.toBinaryString(Integer.parseInt(temp));

    	return ans;
    }
	
	public static void main(String[] args) {
		 String date1 = "2080-02-29";
	        System.out.println(convertDateToBinary(date1));
	}
}

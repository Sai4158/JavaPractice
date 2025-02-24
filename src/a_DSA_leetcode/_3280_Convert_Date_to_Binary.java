package a_DSA_leetcode;

public class _3280_Convert_Date_to_Binary {
	
    public static String convertDateToBinary(String date) {
        
//    	String ans = "";
//    	String temp = "";
//    	
//    	for (int i = 0; i < date.length(); i++) {
//			
//    		if(date.charAt(i) != '-') {
//    			temp += date.charAt(i);
//    		}else {
//    			ans += Integer.toBinaryString(Integer.parseInt(temp)) + '-';
//    			temp = "";
//    		}
//		}
//    	ans += Integer.toBinaryString(Integer.parseInt(temp));
//
//    	return ans;
    	
    	
    	StringBuilder ans = new StringBuilder();
    	
    	for (String part : date.split("-")) {
    		ans.append(Integer.toBinaryString(Integer.parseInt(part))).append("-");
    	}
    	
//    	Remove the last extra - 
    	ans.setLength(ans.length() - 1);
    	
    	return ans.toString();
    }
	
	public static void main(String[] args) {
		 String date1 = "2080-02-29";
	        System.out.println(convertDateToBinary(date1));
	}
}

package a_DSA_leetcode;

public class _1957_Delete_Characters_to_Make_Fancy_String {

    public static String makeFancyString(String s) {
        
    	StringBuilder ans = new StringBuilder();
    	ans.append(s.charAt(0));
    	
    	
    	int count = 1;
    	
    	for (int i = 1; i < s.length(); i++) {
			
    		
    		if(s.charAt(i) == s.charAt(i-1)) {
    			count++;
    		}else {
    			count = 1;
    		}
    		
    		if(count < 3) {
    			ans.append(s.charAt(i));
    		}
    		
    		
		}
    	
    	return ans.toString();
    	
    }
	
	public static void main(String[] args) {
		String  s = "leeetcode";
		System.out.println(makeFancyString(s));
	}
}

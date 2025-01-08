package a_DSA_leetcode;

public class _2810_Faulty_Keyboard {
	
    public static String finalString(String s) {
        StringBuilder sb =  new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
			
        	if(s.charAt(i) == 'i'){
        		sb.reverse();
        	}else {
        		sb.append(s.charAt(i));
        	}
        	
		}
        
        return sb.toString();
    	
    }
	
	public static void main(String[] args) {
		String s  = "string";
		System.out.println(finalString(s));
	}
}

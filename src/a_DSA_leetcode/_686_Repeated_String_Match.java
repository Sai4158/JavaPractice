package a_DSA_leetcode;

public class _686_Repeated_String_Match {
	
    public static int repeatedStringMatch(String a, String b) {

    	StringBuilder sb = new StringBuilder();
    	
    	int count = 0;
    	
    	while(sb.length() < b.length()) {
    		sb.append(a);
    		count++;
    	}
    	
    	if(sb.toString().contains(b)) {
    		return count;
    	}
    	
    	sb.append(a);
    	count++;
    	
    	if(sb.toString().contains(b)) {
    		return count;
    	}
    	
    	return -1;
    }
	
	public static void main(String[] args) {
		String a = "abcd", b = "cdabcdab";
		System.out.println(repeatedStringMatch(a, b));
	}
}

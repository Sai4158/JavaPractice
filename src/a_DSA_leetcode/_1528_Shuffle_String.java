package a_DSA_leetcode;

public class _1528_Shuffle_String {
	
    public static String restoreString(String s, int[] indices) {
        
    	int n =	indices.length;
    	
    	char[] c =  new char[s.length()];
    	
    	for (int i = 0; i < indices.length; i++) {
			
    		c[indices[i]] =  s.charAt(i);
    		
		}
    	
    	return new String(c);
    	
    }
	
	
	public static void main(String[] args) {
		String s = "codeleet";
		int indices[] = {4,5,6,7,0,2,1,3};
		
		System.out.println(restoreString(s, indices));
	}
}

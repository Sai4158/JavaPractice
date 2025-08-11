package a_DSA_leetcode;


public class _1925_Count_Square_Sum_Triples {
	
    public static int countTriples(int n) {
        
    	int count = 0;
    	
    	for (int a = 1; a <= n; a++) {
			
    		for (int b = 1; b <= n; b++) {
				
    			int c = (int) Math.sqrt(a*a + b*b);
    			
    			if(c <= n && c*c == a*a + b*b) {
    				count++;
    			}
    			
			}
    		
		}
    	
    	return count;
    	
    }
	
	public static void main(String[] args) {
		int n = 10;
		System.out.println(countTriples(n));
	}
}

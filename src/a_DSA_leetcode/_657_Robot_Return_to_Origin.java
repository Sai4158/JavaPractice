package a_DSA_leetcode;

public class _657_Robot_Return_to_Origin {
	
    public static boolean judgeCircle(String moves) {
        
    	int n =  moves.length();
    	
    	int count1 = 0;
    	int count2 = 0;
    	
    	for (int i = 0; i < n; i++) {
			
    		char c = moves.charAt(i);
    		
    		if(c == 'R') {
    			count1++;
    		}
    		
    		else if (c == 'L') {
    			count1--;
    		}
    		
    		else if (c == 'U') {
    			count2++;
    		}
    		
    		else if (c == 'D') {
    			count2--;
    		}
    		
		}
    	
    	
    	return count1 == 0 && count2 ==0;
    }
	
	
	public static void main(String[] args) {
		String moves = "UD";
		System.out.println(judgeCircle(moves));
	}
}

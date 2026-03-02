package a_DSA_leetcode;

public class _Daily_Temperatures_ {

    public static int[] dailyTemperatures(int[] temperatures) {
        
    	int n =  temperatures.length;
    	int ans[] = new int[n];
    	
    	
    	for (int i = 0; i < n; i++) {
			
    		ans[i] =  0;
    		
    		for (int j = i + 1; j < n; j++) {

                if (temperatures[j] > temperatures[i]) {
                    ans[i] = j - i;
                    break;
                }
            }
    		
		}
    	return ans;
    }
    
    public static void main(String[] args) {
		
    	int temp[] = {73,74,75,71,69,72,76,73};
    	System.out.println(dailyTemperatures(temp));
	}
	
}

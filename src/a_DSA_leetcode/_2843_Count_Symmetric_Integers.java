package a_DSA_leetcode;

public class _2843_Count_Symmetric_Integers {
	
    public static int countSymmetricIntegers(int low, int high) {
        
    	int count = 0;
    	
    	for (int i = low; i <= high; i++) {
			
    		String num = i +"";
    		int n =  num.length();
    		
    		if(n%2!=0) {
    			continue;
    		}
    		
    		
    		int sum1 = 0;
    		int sum2 =0;
    		
            for (int j = 0; j < n / 2; j++) {
                sum1 += num.charAt(j) - '0';
            }

            for (int j = n / 2; j < n; j++) {
                sum2 += num.charAt(j) - '0';
            }

            if (sum1 == sum2) count++;
    		
		}
    	return count;
    	
    }
	
	public static void main(String[] args) {
		int low = 1, high = 100;
		System.out.println(countSymmetricIntegers(low, high));
	}
}

package a_DSA_part_61_to_part_70;

public class Day70_CountSysmentricNums {
    public static int countSymmetricIntegers(int low, int high) {
        
    	int count = 0;
    	
    	for (int i = low; i < high; i++) {
			
    		String a = i + "";
    		int n =  a.length();
    		
    		if(n%2!=0) {
    			continue;
    		}
    		
    		int sum1 =0;
    		int sum2 =0;
    		
    		
    		for (int j = 0; j < n/2; j++) {
				sum1 += a.charAt(j) - '0';
			}
    		
    		for (int j = n/2; j < n; j++) {
				sum2 += a.charAt(j) - '0';

			}
    	
        	
        	if(sum1 == sum2) {
        		count++;
        	}
		}
    	return count;
    }
	
	public static void main(String[] args) {
		int low = 1, high = 100;
		System.out.println(countSymmetricIntegers(low, high));
	}
}

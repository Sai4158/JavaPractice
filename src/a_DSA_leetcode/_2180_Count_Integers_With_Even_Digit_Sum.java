package a_DSA_leetcode;

public class _2180_Count_Integers_With_Even_Digit_Sum {
	
    public static int countEven(int num) {
        
    
    	int count = 0;
    	
    	 for (int i = 1; i <= num; i++) {
             int sum = 0;
             int n = i;

//             Add the values
             while (n > 0) {
                 sum += n % 10;
                 n /= 10;
             }

//             check if its even
             if (sum % 2 == 0) {
                 count++;
             }
         }

//    	 return the count;
         return count;
     }
	
	public static void main(String[] args) {
		int num = 30;
		
		System.out.println(countEven(num));
	}
}

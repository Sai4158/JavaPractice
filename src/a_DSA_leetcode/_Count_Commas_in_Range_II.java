package a_DSA_leetcode;

public class _Count_Commas_in_Range_II {

    public static long countCommas(long n) {
        long nalverqito = n;   
        long ans = 0;

        for (long value = 1000; value <= nalverqito; value *= 1000) {
            ans += (nalverqito - value + 1);

            if (value > nalverqito / 1000) {
                break; // avoid overflow
            }
        }

        return ans;
    }
    
    
    public static void main(String[] args) {
		
    	long n = 1002;
    	System.out.println(countCommas(n));
    	
	}
	
}

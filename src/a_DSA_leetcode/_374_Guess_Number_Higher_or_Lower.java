package a_DSA_leetcode;

public class _374_Guess_Number_Higher_or_Lower {
	
    public static int guessNumber(int n) {
         
    	int l = 1;
    	int r = n;
    	
    	while(l<=r) {
    		int mid = l+(r-l)/2;
    		
//    		guess is calling guess function on leetcode problem 
    		int check = guess(mid);
    		
    		if(check == 0) {
    			return mid;
    		}else if(check == -1){
    			r = mid -1;
    		}else {
    			l =  mid+1;
    		}
    	}
    	return -1;
    }
	
	public static void main(String[] args) {
		int n = 5;
		
		System.out.println(guessNumber(n));
	}
}

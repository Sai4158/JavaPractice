package a_DSA_part_31_to_part_40;

public class Day25VariableSlidingWindowPractice {
	 public static void main(String[] args) {
	        
		 	int arr[] = {1, 2, 3, 45, 6, 6};
	        int k = 10;

	        int l = 0;
	        int ans = 0;
	        int temp = 0;

	        
	        for (int i = 0; i < arr.length; i++) {
	            temp += arr[i]; 

	            while (temp > k) {
	                temp -= arr[l];
	                l++;
	            }

	            ans = Math.max(ans, i - l + 1);
	        }

	        System.out.println(ans); 
	    }
	}	

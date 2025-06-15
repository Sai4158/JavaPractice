package a_DSA_leetcode;

public class _1442_Count_Triplets_That_Can_Form_Two_Arrays_of_Equal_XOR {
	
    public static int countTriplets(int[] arr) {
        
    	int n =  arr.length;
    	int count = 0;
    	
    	for (int i = 0; i < n; i++) {
		
    		int xor = arr[i];
    		
    		for (int j = i+1; j < n; j++) {
				
    			xor ^= arr[j];
    			    			
    			if(xor == 0) {
    				count+= (j-i);
    			}	
			}
		}
    	
    	return count;
    }
	
	public static void main(String[] args) {
		int arr[] = {2,3,1,6,7};
		System.out.println(countTriplets(arr));
	}
}

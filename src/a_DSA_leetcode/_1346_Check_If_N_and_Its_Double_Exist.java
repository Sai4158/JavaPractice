package a_DSA_leetcode;

public class _1346_Check_If_N_and_Its_Double_Exist {
	
    public static boolean checkIfExist(int[] arr) {
        
    	int n =  arr.length;
    	
    	for (int i = 0; i < n; i++) {
			
    		for (int j = i+1; j < n; j++) {
				
    			if(arr[i] == 2 * arr[j] || arr[j] == 2 * arr[i] ) {
    				return true;
    			}
    			
    			
			}
    		
    		
		}
    	return false;
    }
	
	public static void main(String[] args) {
		int nums[] = {3,1,7,11};
		System.out.println(checkIfExist(nums));
	}
}

package a_DSA_leetcode;

import java.util.Arrays;

public class _942_DI_String_Match {
	
    public static int[] diStringMatch(String s) {
        
    	int n = s.length();
    	int ans[] =  new int [n+1];
    	
    	
    	int iCount = 0;
    	int dCount = n;
    	
    	for (int i = 0; i < n; i++) {
			if(s.charAt(i) == 'I') {
				ans[i] = iCount++;
			}else {
				ans[i] = dCount--;
			}
		}
//    	Adding the last element
    	ans[n] = iCount; 
    	return ans;
    }
	
	public static void main(String[] args) {
		String s = "IDID";
		System.out.println(Arrays.toString(diStringMatch(s)));
	}
}

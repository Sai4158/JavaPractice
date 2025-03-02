package a_DSA_leetcode;

public class _2433_Find_The_Original_Array_of_Prefix_Xor {
	
    public static int[] findArray(int[] pref) {
        
    	int n = pref.length;
    	int ans[] = new int[n];
    	
    	ans[0] = pref[0];
    	
    	for (int i = 1; i < ans.length; i++) {
			ans[i] = pref[i] ^ pref[i-1];
		}
    	return ans;
    }
	
	public static void main(String[] args) {
		int pref[] = {5,2,0,3,1};
		System.out.println(findArray(pref));
	}
}

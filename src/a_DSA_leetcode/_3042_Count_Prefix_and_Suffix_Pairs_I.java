package a_DSA_leetcode;

public class _3042_Count_Prefix_and_Suffix_Pairs_I {
	
    public static int countPrefixSuffixPairs(String[] words) {
        
//    	count
    	int n = words.length;
    	int count = 0;
    	
//    	run from i to n -1 
    	for (int i = 0; i < n -  1; i++) {
			
//    		run from i +1 to n
    		for (int j = i + 1; j < n; j++) {
				
    			String a = words[i];
    			String b = words[j];
    			
//    			if they match count++
    			if(b.startsWith(a) && b.endsWith(a)) {
    				count++;
    			}
    			
			}
    		
		}
    	
//    	Return the count
    	return count;
    	
    }
	
	public static void main(String[] args) {
		String words[] = {"a","aba","ababa","aa"};
		System.out.println(countPrefixSuffixPairs(words));
	}
}

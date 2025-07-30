package a_DSA_leetcode;

public class _3042_Count_Prefix_and_Suffix_Pairs_I {
	
    public static int countPrefixSuffixPairs(String[] words) {
        
    	int n = words.length;
    	int count = 0;
    	
    	for (int i = 0; i < words.length; i++) {
			
    		for (int j = i+1; j < words.length; j++) {
				
    			if(words[j].startsWith(words[i]) && words[i].endsWith(words[i])) {
    				count++;
    			}
    			
			}
    		
		}
    	
    	
    	return count;
    	
    }
	
	public static void main(String[] args) {
		String words[] = {"a","aba","ababa","aa"};
		System.out.println(countPrefixSuffixPairs(words));
	}
}

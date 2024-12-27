package a_DSA_leetcode;

public class _1684_Count_the_Number_of_Consistent_Strings {
	
    public int countConsistentStrings(String allowed, String[] words) {
        
        int n = words.length;
        int count = 0;
        
        for (int i = 0; i < words.length; i++) {
        	String word = words[i];
			for (int j = 0; j < word.length(); j++) {
				
				char a = word.charAt(j);
				 
				if (allowed.indexOf(a) == -1) {
                    count--; 
                    break; 
                }
				
			}
			count++; 
		}
        
        return count;

    }
    public static void main(String[] args) {
        _1684_Count_the_Number_of_Consistent_Strings solution = new _1684_Count_the_Number_of_Consistent_Strings();

        String allowed = "ab";
        String[] words = {"ad", "bd", "aaab", "baa", "badab"};
        System.out.println(solution.countConsistentStrings(allowed, words)); // Output: 2
    }
}

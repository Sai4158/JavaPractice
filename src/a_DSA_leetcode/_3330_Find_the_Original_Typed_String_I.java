package a_DSA_leetcode;

public class _3330_Find_the_Original_Typed_String_I {

    public static int possibleStringCount(String word) {
        int n = word.length();
        int count = 1; 
        int ans = 1;  

        for (int i = 1; i < n; i++) {
            if (word.charAt(i) == word.charAt(i - 1)) {
                count++;
            } else {
                if (count > 1) ans += (count - 1); 
                count = 1;
            }
        }

        if (count > 1) ans += (count - 1);

        return ans;
    }
    
    public static void main(String[] args) {
		String word = "abbcccc";
		System.out.println(possibleStringCount(word));
	}
	
}

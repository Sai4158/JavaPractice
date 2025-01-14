package a_DSA_part_41_to_part_50;

public class Day37Recap {

	    public static int substringCount(String[] words, String substr) {
	        int n = words.length;
	        int count = 0;

	        for (int i = 0; i < n; i++) {
	            if (words[i].contains(substr)) { 
	                count++;
	            }
	        }

	        return count; 
	    }

	    public static void main(String[] args) {
	        String[] words1 = {"hello", "world", "help", "held"};
	        String substr1 = "hel";
	        System.out.println(substringCount(words1, substr1)); 
	    }
	

}

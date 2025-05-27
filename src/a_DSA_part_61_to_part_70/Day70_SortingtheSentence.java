package a_DSA_part_61_to_part_70;

public class Day70_SortingtheSentence {

	public static String sortSentence(String s) {
		
		String words[] = s.split(" ");
		String ans[] =  new String[words.length];
		int n =  words.length;
		
		 for (int i = 0; i < n; i++) {
	            String word = words[i];
	            int index = word.charAt(word.length() - 1) - '1'; 
	            ans[index] = word.substring(0, word.length() - 1); 
	        }
		
		return String.join(" ", ans);
	}
	
	public static void main(String[] args) {
		System.out.println(sortSentence("is2 sentence4 This1 a3"));
	}
	
}

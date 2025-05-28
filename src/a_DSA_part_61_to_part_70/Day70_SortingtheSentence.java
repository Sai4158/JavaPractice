package a_DSA_part_61_to_part_70;

public class Day70_SortingtheSentence {

	public static String sortSentence(String s) {
		
//		Split the words 
		String words[] = s.split(" ");
//		string words to be added
		String ans[] =  new String[words.length];
		int n =  words.length;
		

		 for (int i = 0; i < n; i++) {
//			 get the last index and convert string to Int
	            String word = words[i];
	            int index = word.charAt(word.length() - 1) - '1'; 
	            
//	            Once you get the index, use to store each word using substring to cut the last letter.
	            ans[index] = word.substring(0, word.length() - 1); 
	        }
		
//		 Join all the array of string using the space and use the array of string to join
		return String.join(" ", ans);
	}
	
	public static void main(String[] args) {
		System.out.println(sortSentence("is2 sentence4 This1 a3"));
	}
	
}

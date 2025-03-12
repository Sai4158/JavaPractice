package a_DSA_leetcode;

public class _1935_Maximum_Number_of_Words_You_Can_Type {
	public static int canBeTypedWords(String text, String brokenLetters) {
		
		String words[] = text.split(" ");
		int count = 0;
		
		for (int i = 0; i < words.length; i++) {
			
			boolean check =  true;
			
			for (int j = 0; j < brokenLetters.length(); j++) {
				
				if (words[i].contains(String.valueOf(brokenLetters.charAt(j)))) { 
					check = false;
					break;
				}
			}
			
			if(check) {
				count++;
			}
		}
		return count;
		
	}

	public static void main(String[] args) {
		System.out.println(canBeTypedWords("hello world", "ad"));
	}
}

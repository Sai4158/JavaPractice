package a_DSA_part_51_to_part_60;

public class Day54_canBeTypedWords {
	
	public static int canBeTypedWords(String text, String brokenLetters) {
		
		String words[] =  text.split(" ");
		int count = 0;
		
		for (int i = 0; i < words.length; i++) {
			
			boolean check =  true;
			for (int j = 0; j < text.length(); j++) {
				
				if(words[i].contains(String.valueOf(brokenLetters.charAt(i)))) {
					check = false;
				}
				break;
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

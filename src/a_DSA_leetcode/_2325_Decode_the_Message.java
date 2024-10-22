package a_DSA_leetcode;

import java.util.HashMap;

public class _2325_Decode_the_Message {
	public static String decodeMessage(String key, String message) {

        HashMap<Character, Character> hm = new HashMap<>();

          int cnt = 97; 
          	
//          Adding the values to the hashmap
           for (int i = 0; i < key.length(); i++) {
               char ch = key.charAt(i);
        	   
        	   if(ch != ' ' && !hm.containsKey(ch)) {
        		   hm.put(ch, (char)cnt);
        		   cnt++;
        	   }
		}


        // Decode the message
      String ans = " ";
      
      for (int i = 0; i < message.length(); i++) {
		char ch  = message.charAt(i);
		
		if(ch == ' ') {
			ans+= ' ';
		}else {
			ans += hm.get(ch);
		}
	}
      

         
        return ans;
    }
	
	
	public static void main(String[] args) {
		System.out.println(decodeMessage("the quick brown fox jumps over the lazy dog", "vkbs bs t suepuv"));
	
	}
	
}

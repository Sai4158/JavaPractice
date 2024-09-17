package a_DSA_leetcode;

public class _2114_Maximum_Number_of_Words_Found_in_Sentences {
	public static int mostWordsFound(String[] sentences) {
		
//		count i it 
        int count = 0;

//        1st loop to run until senctance length 
        
        for(int i = 0; i < sentences.length; i++){
        	
//        	get the index 
        String s = sentences[i];
        int temp = 1;

                for(int j = 0; j < s.length(); j++){
                    if(s.charAt(j)==' '){
                        temp++;
                    }
                }
            count = Math.max(count,temp);
        }
        return count;
    }
	
	public static void main(String[] args) {
		
		
			System.out.println(mostWordsFound(new String[] 
					{"alice and bob love leetcode","i think so too","this is great thanks very much"}
));
	}
}

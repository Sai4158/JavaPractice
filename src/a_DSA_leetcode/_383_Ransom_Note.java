package a_DSA_leetcode;

public class _383_Ransom_Note {
	public static boolean canConstruct(String ransomNote, String magazine) {

        for(int i=0; i<ransomNote.length(); i++){
        char a = ransomNote.charAt(i);
        int index =  magazine.indexOf(a);
        
        if(index== -1){
            return false;
        }else{
                magazine = magazine.substring(0, index) + magazine.substring(index + 1);
        }
    }
        return true;
    }
	
	public static void main(String[] args) {
		System.out.println(canConstruct("aab", "aab"));
		
	}
}

package a_DSA_leetcode;

import java.util.HashMap;

public class _771_Jewels_and_Stones {

	public static int numJewelsInStones(String jewels, String stones) {

		int count = 0;

		// run until jewels length and get char of each index
		for(int i= 0; i<jewels.length(); i++){
			char a  = jewels.charAt(i);

			// run till stones length then count if index of jewels matches the index of stones
			for(int j= 0; j<stones.length(); j++){
				if(a == stones.charAt(j)){
					count++;
				} 
			}

		}
		return count;
	}
	
//	or 
	
//	solve in hashmap
public static int numJewelsInStones1(String jewels, String stones) {
        
        HashMap<Character, Integer> s1 = new HashMap<>();
        int ans = 0;

        for (int i = 0; i < stones.length(); i++) {
            char ch = stones.charAt(i);
            s1.put(ch, s1.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i < jewels.length(); i++) {
            char ch = jewels.charAt(i);
            if (s1.containsKey(ch)) {
                ans += s1.get(ch);
            }
        }

        return ans;
    }
	
	
	
	
	
	
	
	
	
//	main method 
	public static void main(String[] args) {
		
//						Jewels ,    Stones
	int a =	numJewelsInStones("aA", "aaAfdwd");
	System.out.println(a);
	
	System.out.println(numJewelsInStones1("bb","bbadsa"));
	}
}

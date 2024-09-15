package a_DSA_leetcode;

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
	
//	main method 
	public static void main(String[] args) {
		
//						Jewels ,    Stones
	int a =	numJewelsInStones("aA", "aaAfdwd");
	System.out.println(a);
	}
}

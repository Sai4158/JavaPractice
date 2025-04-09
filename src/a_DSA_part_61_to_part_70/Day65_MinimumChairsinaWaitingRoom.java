package a_DSA_part_61_to_part_70;

public class Day65_MinimumChairsinaWaitingRoom {
	
	public static int minimumChairs(String s) {

		int count = 0;
		int max = 0;
		
		for (int i = 0; i < s.length(); i++) {
			
			char ch = s.charAt(i);
			
			if(ch == 'E') {
				count++;
				
				max =  Math.max(max, count);
			}else {
				count--;
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		String s = "EEEEEEE";
		System.out.println(minimumChairs(s));
	}
}

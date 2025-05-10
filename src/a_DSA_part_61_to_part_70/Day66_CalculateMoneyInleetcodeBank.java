package a_DSA_part_61_to_part_70;

public class Day66_CalculateMoneyInleetcodeBank {

	public static int totalMoney(int n) {
		
		int count = 0;
		int week =  1;
		
		for (int i = 1; i <= n; i++) {
			
			count +=  week + (i - 1) % 7;
			
			
			if(i%7 == 0) {
				week++;
			}
			
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		System.out.println(totalMoney(4));
	}
}

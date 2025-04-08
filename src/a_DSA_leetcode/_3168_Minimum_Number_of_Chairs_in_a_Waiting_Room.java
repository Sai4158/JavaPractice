package a_DSA_leetcode;

public class _3168_Minimum_Number_of_Chairs_in_a_Waiting_Room {

	public static int minimumChairs(String s) {

		int count = 0;
		int max = 0;

		for (int i = 0; i < s.length(); i++) {

			char val =  s.charAt(i);


			if(val == 'E') {
				count++;

				max =  Math.max(max, count);

			}else {
				count--;
			}

		}
		return max;
	}

	public static void main(String[] args) {
		String s = "ELEELEELLL";
		System.out.println(minimumChairs(s));
	}


}

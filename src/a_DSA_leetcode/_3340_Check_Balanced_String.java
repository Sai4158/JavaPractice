package a_DSA_leetcode;

public class _3340_Check_Balanced_String {


		public static boolean isBalanced(String num) {

			int even = 0;
			int odd = 0;

			for (int i = 0; i < num.length(); i++) {
				int c = Character.getNumericValue(num.charAt(i));
				
				if(i % 2 == 0) {
					even += c;
				}else {
					odd += c;
				}
			}
			return even == odd;
		}

		public static void main(String[] args) {
			System.out.println(isBalanced("1234")); 
		}
	}

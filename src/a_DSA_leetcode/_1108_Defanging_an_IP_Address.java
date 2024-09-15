package a_DSA_leetcode;

public class _1108_Defanging_an_IP_Address {
	
	public static String defangIPaddr(String address) {
		String ans = "";

		for (int i = 0; i < address.length(); i++) {

			char a = address.charAt(i);

//			since a is char we need to use single quotes here
			if(a == '.') {
//				all the values are being stored in the String ans;
				ans = ans + "[.]";

			}else {
//				also the numbers are storing too
				ans = ans + a;
			}

		}
		return ans;
	}
	
//	main method
	public static void main(String[] args) {
		System.out.println(defangIPaddr("34.534.434.435.5"));
//		34[.]534[.]434[.]435[.]5
	}

}

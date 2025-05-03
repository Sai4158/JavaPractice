package a_DSA_leetcode;

public class _476_Number_Complement {

	public static int findComplement(int num) {

//		Convert to binary and using to stringbuilder to add 
		String toBinary = Integer.toBinaryString(num);
		StringBuilder sb = new StringBuilder();


// for loops to check if 0 then add 1 or else
		for (int i = 0; i < toBinary.length(); i++) {

			if(toBinary.charAt(i) == '0') {
				sb.append('1');
			}else {
				sb.append('0');
			}

		}

		
//		convert int to string
		return Integer.parseInt(sb.toString(),2);

	}

	public static void main(String[] args) {
		System.out.println(findComplement(5)); 
		System.out.println(findComplement(1)); 
		System.out.println(findComplement(10)); 
	}
}

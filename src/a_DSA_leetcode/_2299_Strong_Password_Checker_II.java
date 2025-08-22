package a_DSA_leetcode;

public class _2299_Strong_Password_Checker_II {


	public static boolean strongPasswordCheckerII(String password) {


		if(password.length() < 8) {
			return false;
		}

		boolean haslower =  false;
		boolean hasupper =  false;
		boolean hasDigit =  false;
		boolean hasSpecial   =  false;
		String specialChars = "!@#$%^&*()-+";


		for (int i = 0; i < password.length(); i++) {

			char c =  password.charAt(i);

			if(i > 0 && password.charAt(i) == password.charAt(i-1)) {
				return false;
			}


			if(Character.isLowerCase(c)) {
				haslower = true;
			} 
			else if(Character.isUpperCase(c)) {
				hasupper = true;

			}
			else if(Character.isDigit(c)) {
				hasDigit = true;

			}

			else if (specialChars.indexOf(c) != -1) hasSpecial = true;

		}



		 return haslower && hasupper && hasDigit && hasSpecial;
	}

	public static void main(String[] args) {
		System.out.println(strongPasswordCheckerII("IloveLe3tcode!"));
	}
}

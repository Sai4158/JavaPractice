package ist_day2_recap;

public class LongerString1 {
	
	private String str1, str2;
	
	public LongerString1(String str1, String str2) {
		this.str1 = str1;
		this.str2 = str2;
	}
	
//	method for Find Longer
	public String findLonger() {
		if(str1.length() > str2.length()) {
			return str1;
		}
		else {
			return str2;
		}
	}
	
//	toString 
	@Override
	public String toString() {
		return "(" + str1 + ", " + str2 + ")";
	}
	
//	main method 
	public static void main(String[] args) {
		LongerString1 string =  new LongerString1("BEFJWFJ", "teslaaaa");
		System.out.println(string.findLonger());
	}
}

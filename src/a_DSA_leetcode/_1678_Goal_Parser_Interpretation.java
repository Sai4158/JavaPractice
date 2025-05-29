package a_DSA_leetcode;

public class _1678_Goal_Parser_Interpretation {

	public static String interpret(String command) {
		
		return command.replace("()","o").replace("(al)", "al");		
				
	}

	public static void main(String[] args) {
		System.out.println(interpret("G()(al)"));
	}
}

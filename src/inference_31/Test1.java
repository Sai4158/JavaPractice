package inference_31;

public class Test1 {
	
	public static void main(String[] args) {
		//VAR = must give value in the same line
		var i = 20000;
		
		//this is varible name after int
		int var = 10;
		var = var + var;
		
		var s1 = "Sai R";
		
		
		// for boolean just true or flase
		var b1 = true;
		
		System.out.println(i);
		System.out.println(s1);
		System.out.println(b1);
		
		//var = 10 so 10+10 = 20
		System.out.println(var);
		
		add(20,50);
		
		
	}
	public static void add(int c, int j) {
			System.out.println(c+j);
			
		}
}

package p22_objects;

public class Test5 {
	int a;
	int b;

	public Test5(){
		a = 5;
		b = 10;
	}
	public Test5(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public int add(){
		return a+b;
	}
	public static void main(String[] args) {
		Test5 st1 = new Test5();
		Test5 st3 = new Test5(5,4);
		Test5 st4 = new Test5(6,3);
		
		System.out.println(st1.add());
		System.out.println(st4.add());
		System.out.println(st3.add());
	}
	
}

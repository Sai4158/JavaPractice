package p22_objects;

public class Test2 {
	int a;
	int b;

	public Test2() {
		a = 15;
		b = 20;
	}
	public Test2(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public int abc() {
		return a+b;
	}
	public static void main(String[] args) {
		Test2 st1 = new Test2();
		Test2 st2 = new Test2(10,20);
		Test2 st3 = new Test2(30, 20);
		
		System.out.println(st1.abc());
		System.out.println(st2.abc());
		System.out.println(st3.abc());
	}
}

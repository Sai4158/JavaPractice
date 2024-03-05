package p22_objects;

public class test {
	int a;
	int b;

	public test() {
		a = 10;
		b = 20;
	}
	
	public test(int a,int b){
		this.a = a;
		this.b = b;
	}
	
	public int abc() {
		return a+b;
	}
	
	public static void main(String[] args) {
		test st1 = new test();
		test st2 = new test(10,30);
		test st3 = new test(50,50);

		System.out.println(st1.abc());
		System.out.println(st2.abc());
		System.out.println(st3.abc());
	}

}

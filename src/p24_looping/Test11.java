package p24_looping;

public class Test11 {
	public static void main(String[] args) {
		int sum  = 0;
		
		for(int i = 40; i < 80; i++) {
			if(i % 2 == 0) {
				System.out.println(i);
				sum += i;
			}
		}
		System.out.println(sum);
	}
}

package a_DSA_leetcode;

public class _3516_Find_Closest_Person {

	public static int findClosest(int x, int y, int z) {

		int a1 = Math.abs(x-z); 
		int a2 = Math.abs(y-z); 

		if(a1<a2) {
			return 1;
		}
		if(a2<a1) {
			return 2;
		}

		else return 0;
	}

	public static void main(String[] args) {
		System.out.println(findClosest(2, 7, 4));
	}
}

package a_DSA_leetcode;


public class _1128_Number_of_Equivalent_Domino_Pairs {

    public static int numEquivDominoPairs(int[][] dominoes) {
        int[] count = new int[100];
        int ans = 0;

        for (int[] d : dominoes) {
            int a = d[0];
            int b = d[1];
            int key = Math.min(a, b) * 10 + Math.max(a, b);

            ans += count[key];  
            count[key]++;       
        }

        return ans;
    }

	public static void main(String[] args) {
		int[][] dominoes = {{1,2},{2,1},{3,4},{5,6}};
		System.out.println(numEquivDominoPairs(dominoes));
	}
}

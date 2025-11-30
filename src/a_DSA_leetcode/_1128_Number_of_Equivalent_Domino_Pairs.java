package a_DSA_leetcode;

import java.util.HashMap;

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
    
    public static int numEquivDominoPairs1(int[][] dominoes) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans = 0;

        for (int[] d : dominoes) {
            int a = d[0];
            int b = d[1];
            int key = Math.min(a, b) * 10 + Math.max(a, b); 

            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        for (int count : map.values()) {
            ans += (count * (count - 1)) / 2;
        }

        return ans;
    }

	public static void main(String[] args) {
		int[][] dominoes = {{1,2},{2,1},{3,4},{5,6}};
		System.out.println(numEquivDominoPairs(dominoes));
		
		int[][] dominoes1 = {{1,4},{4,1},{3,4},{1,4}};
		System.out.println(numEquivDominoPairs1(dominoes1));
		
		
		int[][] dominoes13 = {{1,4},{1,4},{3,4},{3,4},{1,4},{1,4},{1,4},{4,1},{3,4},{1,4}};
		System.out.println(numEquivDominoPairs1(dominoes13));
		
	}
}

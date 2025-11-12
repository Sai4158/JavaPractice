package a_DSA_leetcode;

import java.util.HashMap;
import java.util.PriorityQueue;

public class _1_451_Sort_Characters_By_Frequency {

	public static String frequencySort(String s) {

		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();

		for (int i = 0; i < s.length(); i++) {

			char ch =  s.charAt(i);
			hm.put(ch, hm.getOrDefault(ch, 0)+1);

		}

		PriorityQueue<freq> pq = new PriorityQueue<freq>((a,b) -> b.val -  a.val);

		
		for (char ch : hm.keySet()) {
			freq  temp = new freq(ch, hm.get(ch));
			
			pq.add(temp);
		}
		
		
		StringBuilder s1 =  new StringBuilder();
		
		while(!pq.isEmpty()) {
			freq top =  pq.poll();
			
			char ch =  top.key;
			
			int count = top.val;
			
			
			for (int i = 0; i < count; i++) {
				s1.append(ch);
			}
		}
		
		return s1.toString();
	}

	public static void main(String[] args) {
		String  s = "tree";
		System.out.println(frequencySort(s));
	}

}

class  freq {

	char key;
	int val;

	freq(char key, int val){
		this.key =  key;
		this.val = val;
	}

}

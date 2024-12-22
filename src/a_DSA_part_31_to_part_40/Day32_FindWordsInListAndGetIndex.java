package a_DSA_part_31_to_part_40;

import java.util.ArrayList;

public class Day32_FindWordsInListAndGetIndex {
		public static void main(String[] args) {
			
			ArrayList<String> s1 = new ArrayList<String>();
			
			s1.add("sai");
			s1.add("abhi");
			s1.add("velo");
			s1.add("aefd");
			
			
			
			System.out.println(s1);
			
			int n  =  s1.size();
			int count =  0;
			Character k = 'b';
			
			for (int i = 0; i < n; i++) {
				
				String eachWord = s1.get(i); 
				
				for (int j = 0; j < eachWord.length(); j++) {
					
					char currentChar = eachWord.charAt(j);
	                
					
					if(currentChar == k) {
						count++;
					}

				}
			}
			
			System.out.println("There are totat " + count + " " + k + "'s in this array");
			
		}
	}

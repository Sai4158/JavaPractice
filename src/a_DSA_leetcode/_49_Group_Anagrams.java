package a_DSA_leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import arrayList_Vector_P46.Arraylist;

public class _49_Group_Anagrams {

    public static List<List<String>> groupAnagrams(String[] strs) {
        
    	Map<String, List<String>> map = new HashMap<String, List<String>>();
    	
    	
        for (String s : strs) {
			
        	char arr[] = s.toCharArray();
        	Arrays.sort(arr);
            String key = new String(arr);

            map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
		}
        
        return new ArrayList<>(map.values());

    }
    
    public static void main(String[] args) {
    	 String strs[] = {"eat","tea","tan","ate","nat","bat"};
	
    	 System.out.println(groupAnagrams(strs));
    }
	
}

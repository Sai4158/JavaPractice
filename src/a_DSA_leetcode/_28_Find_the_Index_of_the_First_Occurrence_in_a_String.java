package a_DSA_leetcode;

import java.awt.desktop.AppReopenedEvent;

public class _28_Find_the_Index_of_the_First_Occurrence_in_a_String {

    public static int strStr(String haystack, String needle) {
        
    	if(haystack.contains(haystack)) {
    		return haystack.indexOf(needle);
    	}
    	return -1;
    }	
	
	public static void main(String[] args) {
		
		String  haystack = "sadbutsad", needle = "sad";
		
		System.out.println(strStr(haystack, needle));
	}
}

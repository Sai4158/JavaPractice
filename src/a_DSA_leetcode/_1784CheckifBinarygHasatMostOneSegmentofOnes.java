package a_DSA_leetcode;

public class _1784CheckifBinarygHasatMostOneSegmentofOnes {
	
    public static boolean checkOnesSegment(String s) {
        return !s.contains("01");
    }	
	public static void main(String[] args) {
		String s = "1001";
		System.out.println(checkOnesSegment(s));
	}
}

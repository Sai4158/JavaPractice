package _B_LC;

public class _Character_Reprogramming {
	
    public static int getMaxDeletions(String s) {


        int u = 0, d = 0, r = 0, l = 0;
    	
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == 'U') u++;
            else if (c == 'D') d++;
            else if (c == 'R') r++;
            else if (c == 'L') l++;
        }
    	
    	
        int netX = r - l;
        int netY = u - d;
    	

        int mustKeep = Math.abs(netX) + Math.abs(netY);
        return s.length() - mustKeep;
    	
    }
	
	public static void main(String[] args) {
		String s  = "URDR";
		System.out.println(getMaxDeletions(s));
	}
}

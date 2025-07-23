package a_DSA_leetcode;


public class _2315_Count_Asterisks {

    public static int countAsterisks(String s) {
        
    	int n =  s.length();
    	boolean insideBar =  false;
    	int count = 0;
    	
    	  for (int i = 0; i < s.length(); i++) {
              char c = s.charAt(i);

              if (c == '|') {
                  insideBar = !insideBar; 
              } else if (c == '*' && !insideBar) {
                  count++;
              }
          }

          return count;
      }

    
    public static void main(String[] args) {
		String s = "l|*e*et|c**o|*de|";
		System.out.println(countAsterisks(s));
	}
}

package a_DSA_leetcode;

public class _466_Count_The_Repetitions {


	public static int getMaxRepetitions(String s1, int n1, String s2, int n2) {


		String add1 = "";
		String add2 = "";
		
//		concatenating 
		 int k = 0;
	        while (k < n1) {
	            add1 += s1;
	            k++;
	        }

	        int j = 0;
	        while (j < n2) {
	            add2 += s2;
	            j++;
	        }
		
		int index = 0;
		int count = 0;
		
        for (int i = 0; i < add1.length(); i++) {
			
//			if char are equal then move the index by ++
            if (add1.charAt(i) == add2.charAt(index)) {
				index ++;
				
				
//				if index has reached its length increase count and reset index
                if (index == add2.length()) {
					
					count++;
					index = 0;
				}
				
				
			}
						
		}
		 return count ;

	}

	public static void main(String[] args) {
		String 	s1 = "acb";
		int n1 = 4;
		
		String s2 = "ab";
		int n2 = 2;
		
		System.out.println(getMaxRepetitions(s1, n1, s2, n2));
	}

}

package a_DSA_leetcode;

public class _2024_Maximize_the_Confusion_of_an_Exam {
	 public static int maxConsecutiveAnswers(String answerKey, int k) {
	        
		 int n =  answerKey.length();
		 int countT = 0;
		 int countf = 0;
		 int ans = 0;
		 int  l = 0;
		 
		 for (int r = 0; r < n; r++) {
			char ch = answerKey.charAt(r);
			char chl = answerKey.charAt(l);
			
			 if(ch == 'T') {
				 countT++;
				 
			 }else {
				 countf++;
			 }
			 
			 
			 while (Math.max(countf, countT)>k) {
				 if(chl == 'T') {
					 countT--;
					 
				 }else {
					 countf--;
				 }
				 
				 l++;
				 
			}
			 ans =  Math.max(ans, r-l+1);
		 }
	        return ans;
	    }
	 
	 
	 
//	 Main method
	 
	 public static void main(String[] args) {
		
		 String answerKey = "TTFF";
		 int k = 2;
		 
		 System.out.println(maxConsecutiveAnswers(answerKey, k));
	}
}

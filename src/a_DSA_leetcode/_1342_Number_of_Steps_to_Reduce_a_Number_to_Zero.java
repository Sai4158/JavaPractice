package a_DSA_leetcode;

public class _1342_Number_of_Steps_to_Reduce_a_Number_to_Zero {
	 public static int numberOfSteps(int num) {

	       int count = 0;

	       while(num > 0 ){
	        if(num % 2 == 0){
	            num/=2;
	        }else{
	            num-=1;
	        }
	        count++;
	       }
	       return count;
	    }
	 
	 public static void main(String[] args) {
		 System.out.println(numberOfSteps(55));
	}
}

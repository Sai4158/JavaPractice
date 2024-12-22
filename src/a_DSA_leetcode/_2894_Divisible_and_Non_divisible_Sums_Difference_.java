package a_DSA_leetcode;

public class _2894_Divisible_and_Non_divisible_Sums_Difference_ {
	
    public static int differenceOfSums(int n, int m) {
        
        
        int num1 = 0;
        int num2 = 0;

        for(int i= 1; i<=n; i++){

         if(i%m==0){
             num1+=i;
         }else{
                 num2+=i; 
             }

        }

        int ans = num2 - num1;

         return ans;
        
    }
    
//    Main
    public static void main(String[] args) {
		int n = 5;
		
		int m =3;
		
		System.out.println(differenceOfSums(n, m));
	}
}

package a_DSA_leetcode;

public class _2011_finalValueAfterOperations {
	
	public static int finalValueAfterOperations(String[] operations) {
        int store= 0;


        for(int i=0; i<operations.length; i++){
            if(operations[i].equals("--X" ) || operations[i].equals("X--")){
              store--;
            }else if(operations[i].equals("++X" ) || operations[i].equals("X++")){
                store++;
            }
        }

        return store;
    }
	
	public static void main(String[] args) {
		System.out.println(finalValueAfterOperations(new String[] {"++X", "X++", "X++"}));
	}
}

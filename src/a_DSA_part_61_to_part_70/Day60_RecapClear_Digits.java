package a_DSA_part_61_to_part_70;

import java.util.Stack;

public class Day60_RecapClear_Digits {
	
	public static int calPoints(String[] operations) {
    	
		Stack<Integer> st =  new Stack<Integer>();
		
		for (int i = 0; i < operations.length; i++) {
			
			String val =  operations[i];
			
			if(val.equals("+")){
				
				int to = st.pop();
				int to2 = st.peek();
				
				st.push(to);
				
				st.push(to + to2);
				
				
			}
			
			else if(val.equals("D")){
				int  to = st.peek();
				st.push(to*2);
			}
			
			else if(val.equals("C")) {
				
				st.pop();
			}
			
			else {
				st.push(Integer.valueOf(val));
			}
		}
		
		int ans = 0;
		
		for(int i : st) {
			ans += i;
		}
		
		return ans;
    }
	
	
	public static void main(String[] args) {
		String s[] = {"5","2","C","D","+"};
		
		System.out.println(calPoints(s));
	}
}

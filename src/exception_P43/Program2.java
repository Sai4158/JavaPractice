package exception_P43;

public class Program2 {
	public static void main(String[] args) {
		
		//highlight and right click surround with 
		try {
			int []arr = {32,2,34};
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + ",");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

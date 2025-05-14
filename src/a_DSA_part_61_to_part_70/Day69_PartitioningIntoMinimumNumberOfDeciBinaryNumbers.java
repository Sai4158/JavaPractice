package a_DSA_part_61_to_part_70;

public class Day69_PartitioningIntoMinimumNumberOfDeciBinaryNumbers {

    public static int minPartitions(String n) {
    	
    	int max = 0;
    	
    	for (int i = 0; i < n.length(); i++) {
			
    		int c = n.charAt(i) - '0';
    		
    		if(c >  max ) {
    			max =  c;
    		}
    		
		}
    	return max;
    }
	
    public static void main(String[] args) {
		String n = "32";
		System.out.println(minPartitions(n));
	}
}

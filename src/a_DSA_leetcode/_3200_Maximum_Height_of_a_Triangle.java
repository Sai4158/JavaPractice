package a_DSA_leetcode;

public class _3200_Maximum_Height_of_a_Triangle {

	public static int simulateTriangle(int redBalls, int blueBalls) {
        int currentRow = 1;
        int height = 0;
        while (redBalls >= 0 && blueBalls >= 0) {
            if (currentRow % 2 == 1) {
                redBalls -= currentRow;
            } else {
                blueBalls -= currentRow;
            }
            if (redBalls < 0 || blueBalls < 0) {
                return height;
            }
            height++;
            currentRow++;
        }
        return height;
    }

    public static int  maxHeightOfTriangle(int red, int blue) {
        return Math.max(simulateTriangle(red, blue), simulateTriangle(blue, red));
    }
    
    
    
    public static void main(String[] args) {
        int red = 2, blue = 4;
        System.out.println(maxHeightOfTriangle(red, blue)); 
    }
}

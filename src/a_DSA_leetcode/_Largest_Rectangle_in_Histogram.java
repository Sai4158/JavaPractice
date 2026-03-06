package a_DSA_leetcode;

import java.util.Stack;

public class _Largest_Rectangle_in_Histogram {

    public static int largestRectangleArea(int[] heights) {

        int n = heights.length;
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;

        for (int i = 0; i <= n; i++) {

            int currentHeight = (i == n) ? 0 : heights[i];

            while (!stack.isEmpty() && currentHeight < heights[stack.peek()]) {

                int h = heights[stack.pop()];
                int width;

                if (stack.isEmpty()) {
                    width = i; 
                } else {
                    width = i - stack.peek() - 1; 
                }

                maxArea = Math.max(maxArea, h * width);
            }

            if (i < n) stack.push(i);
        }

        return maxArea;
    }

    public static void main(String[] args) {
        int heights1[] = {2, 4};
        System.out.println(largestRectangleArea(heights1)); // 4

        int heights2[] = {2, 1, 5, 6, 2, 3};
        System.out.println(largestRectangleArea(heights2)); // 10
    }
}
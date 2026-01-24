package a_DSA_leetcode;

public class _563_Binary_Tree_Tilt {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {}

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    static int totalTilt = 0;

    public static int findTilt(TreeNode root) {
        totalTilt = 0;
        dfs(root);
        return totalTilt;
    }

    private static int dfs(TreeNode node) {
        if (node == null) return 0;

        int left = dfs(node.left);
        int right = dfs(node.right);

        totalTilt += Math.abs(left - right);

        return left + right + node.val;
    }
}

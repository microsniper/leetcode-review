package com.sniper.leetcodereview.solution.algorithm.dfs.topic_938;

/**
 * @Description
 * @Author sniper
 * @Date 2024/6/19 3:28 PM
 **/
public class Solution {
    private static int dfs(TreeNode root, int low, int high) {

        int result = 0;
        return backDfs(root,low,high,result);
    }

    private static int backDfs(TreeNode root, int low, int high, int result) {
        if (root == null){
            return 0;
        }
        int leftVal = backDfs(root.left, low, high,result);
        int rightVal = backDfs(root.right, low, high,result);
        result = leftVal + rightVal;
        if (root.val >= low && root.val <= high){
            result += root.val;
        }
        return result;
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}

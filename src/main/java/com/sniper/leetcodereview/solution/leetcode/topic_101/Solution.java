package com.sniper.leetcodereview.solution.leetcode.topic_101;

/**
 * @Description
 * @Author sniper
 * @Date 2024/7/31 8:28 PM
 **/
public class Solution {
    public static boolean isSymmetric(TreeNode root) {
        return backIsSymmetric(root.left,root.right);
    }

    private static Boolean backIsSymmetric(TreeNode left, TreeNode right) {
        if (left == null && right == null){
            return true;
        }
        if (left == null || right == null){
            return false;
        }
        return left.val == right.val && backIsSymmetric(left.left,right.right) && backIsSymmetric(left.right,right.left);
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}

package com.sniper.leetcodereview.solution.leetcode.topic_98;


/**
 * @Description
 * @Author sniper
 * @Date 2024/7/31 7:42 PM
 **/
public class Solution {
    private static TreeNode prev;

    public static boolean isValidBST(TreeNode root) {
        return backIsValidBST(root);
    }

    private static Boolean backIsValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (!backIsValidBST(root.left)) {
            return false;
        }
        if (prev != null && prev.val >= root.val) {
            return false;
        }
        prev = root;
        return backIsValidBST(root.right);
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

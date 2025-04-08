package com.sniper.leetcodereview.solution.leetcode100.topic_98;


import java.util.Stack;

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

    public static boolean isValidBST2(TreeNode root) {
        if (root == null) {
            return true;
        }
        Stack<TreeNode> queue = new Stack<>();
        TreeNode pre = null;
        TreeNode cur = root;
        while (cur != null || !queue.isEmpty()) {

            while (cur != null) {
                queue.add(cur);
                cur = cur.left;
            }
            cur = queue.pop();
            if (pre != null && pre.val >= cur.val) {
                return false;
            }
            pre = cur;
            cur = cur.right;

        }
        return true;
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

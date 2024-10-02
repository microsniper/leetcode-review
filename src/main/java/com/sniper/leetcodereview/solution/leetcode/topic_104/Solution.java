package com.sniper.leetcodereview.solution.leetcode.topic_104;


/**
 * @Description 二叉树的最大深度
 * @Author sniper
 * @Date 2024/9/23 11:31 PM
 **/
public class Solution {
    public static int maxDepth(TreeNode root) {
        if (root == null){
            return 0;
        }
        int maxLeft = maxDepth(root.left);
        int maxRight = maxDepth(root.right);

        return Math.max(maxLeft,maxRight) + 1;
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

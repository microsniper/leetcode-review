package com.sniper.leetcodereview.solution.leetcode200.topic_543;

/**
 * sniper
 * 2025/3/22 上午11:22
 */
public class Solution {
    int ans = 0;

    public int diameterOfBinaryTree(TreeNode root) {

        back(root);
        return ans;
    }

    public int back(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftDepth =  back(root.left);
        int rightDepth = back(root.right);
        ans = Math.max(ans, leftDepth + rightDepth);
        return Math.max(leftDepth, rightDepth) + 1;
    }

     public class TreeNode {
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

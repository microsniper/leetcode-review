package com.sniper.leetcodereview.solution.leetcode200.topic_108;

/**
 * sniper
 * 2025/3/30 下午3:53
 */
public class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        int len = nums.length;

        return sortedArrayToBSTBack(nums, 0, len-1);



    }
    public TreeNode sortedArrayToBSTBack(int[] nums, int left, int right)  {
        if (left > right) return null;
        int mid = left + (right - left) /2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = sortedArrayToBSTBack(nums, left, mid -1);
        node.right = sortedArrayToBSTBack(nums, mid + 1, right);
        return node;
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

package com.sniper.leetcodereview.solution.leetcode200.topic_230;

import java.util.PriorityQueue;
import java.util.Stack;

/**
 * sniper
 * 2025/4/4 下午1:13
 */
public class Solution {
    public int kthSmallest(TreeNode root, int k) {
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        PriorityQueue<Integer> queue = new PriorityQueue<>();
        while (!stack.isEmpty()) {
            int size = stack.size();

            for (int i=0; i<size; i++) {
                TreeNode node =  stack.pop();
                queue.add(node.val);
                if (node.left != null) {
                    stack.push(node.left);
                }
                if (node.right != null) {
                    stack.push(node.right);
                }
            }
        }
        if (!queue.isEmpty()) {

            for (int i=0; i<k-1; i++) {
                queue.poll();
            }
            return queue.poll();
        }
        return 0;

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

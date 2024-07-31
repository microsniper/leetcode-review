package com.sniper.leetcodereview.solution.leetcode.topic_94;

import com.sniper.leetcodereview.AlgorithmTest;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Author sniper
 * @Date 2024/7/31 3:03 PM
 **/
public class Solution {
    // 递归

    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        dfs(root,list);
        return list;
    }

    public static void dfs(TreeNode root, List<Integer> list){
        if (root == null){
            return;
        }
        dfs(root.left,list);
        list.add(root.val);
        dfs(root.right,list);
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

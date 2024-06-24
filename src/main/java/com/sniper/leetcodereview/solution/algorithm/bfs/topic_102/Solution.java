package com.sniper.leetcodereview.solution.algorithm.bfs.topic_102;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @Description
 * @Author sniper
 * @Date 2024/6/23 3:31 PM
 **/
public class Solution {

    /**
     * BFS
     * @param root
     * @return
     */
    public static List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null){
            return new ArrayList<>();
        }
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (queue.size() > 0){
            List<Integer> list = new ArrayList<>();
            for (int n = queue.size(); n > 0; --n) {
                TreeNode node = queue.poll();
                list.add(node.val);
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            res.add(new ArrayList<>(list));
        }
        return res;
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

    /**
     * DFS
     * @param root
     * @return
     */
    public static List<List<Integer>> levelOrder2(TreeNode root) {
        if (root == null){
            return new ArrayList<>();
        }
        List<List<Integer>> res = new ArrayList<>();
        dfsBack(root,res,0);
        return res;
    }

    public static void dfsBack(TreeNode node, List<List<Integer>> res, int level){
        if (node == null){
            return;
        }
        if (level > res.size()-1){
            res.add(new ArrayList<>());
        }
        res.get(level).add(node.val);
        dfsBack(node.left,res,level+1);
        dfsBack(node.right,res,level+1);
    }
}

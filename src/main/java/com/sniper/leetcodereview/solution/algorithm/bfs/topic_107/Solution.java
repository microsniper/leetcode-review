package com.sniper.leetcodereview.solution.algorithm.bfs.topic_107;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @Description
 * @Author sniper
 * @Date 2024/6/23 5:04 PM
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
        LinkedList<List<Integer>> linkedList = new LinkedList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (queue.size() > 0){
            List<Integer> list = new ArrayList<>();
            int size = queue.size();
            while (size > 0){
                TreeNode node = queue.poll();
                list.add(node.val);
                if (node.left != null)
                    queue.add(node.left);
                if (node.right != null)
                    queue.add(node.right);
                size -= 1;
            }
            linkedList.addFirst(list);
        }

        for(List<Integer> list : linkedList){
            res.add(list);
        }
        return res;
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
        List<List<Integer>> list = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        dfsBack(root,list,0);
        for(int i=list.size()-1; i>=0; i--){
            res.add(list.get(i));
        }
        return res;
    }

    public static void dfsBack(TreeNode node, List<List<Integer>> list, int level){
        if (node == null){
            return;
        }
        if (level > list.size()-1){
            list.add(new ArrayList<>());
        }
        list.get(level).add(node.val);
        dfsBack(node.left,list,level+1);
        dfsBack(node.right,list,level+1);

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

package com.sniper.leetcodereview.solution.leetcode100.topic_95;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Author sniper
 * @Date 2024/7/31 4:25 PM
 **/
public class Solution {
    public static List<TreeNode> generateTree(int n){
        return dfs(1,n);
    }

    private static List<TreeNode> dfs(int l, int r) {
        List<TreeNode> res = new ArrayList<>();
        if (l > r){
            res.add(null);
        }

        for(int i = l; i<=r; i++){
            List<TreeNode> lnodes = dfs(l,i-1);
            List<TreeNode> rnodes = dfs(i+1,r);
            for(int j=0; j<lnodes.size(); j++){
                for(int k=0; k<rnodes.size(); k++){
                    TreeNode root = new TreeNode(i);
                    root.left = lnodes.get(j);
                    root.right = rnodes.get(k);
                    res.add(root);
                }
            }
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
}

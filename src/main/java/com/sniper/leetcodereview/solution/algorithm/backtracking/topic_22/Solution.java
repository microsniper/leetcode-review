package com.sniper.leetcodereview.solution.algorithm.backtracking.topic_22;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Author sniper
 * @Date 2024/6/11 3:41 PM
 **/
public class Solution {
    public static List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        backTrace(n,0,0,res,"");
        return res;
    }

    private static void backTrace(int n, int open, int close, List<String> res, String current) {
        if (current.length() == n * 2){
            res.add(current);
            return;
        }
        if (open < n){
            backTrace(n,open+1,close,res,current+"(");
        }
        if (close < open){
            backTrace(n,open,close+1,res,current+")");
        }
    }
}

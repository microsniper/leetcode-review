package com.sniper.leetcodereview.solution.leetcode100.topic_22;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description 生成括号
 * @Author sniper
 * @Date 2024/7/3 4:37 PM
 **/
public class Solution {

    public static List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        backGenerateParenthesis(n,res,"",0,0);
        return res;
    }

    private static void backGenerateParenthesis(int n, List<String> res, String s,int open,int close) {
        if (s.length() == n * 2){
            res.add(s);
            return;
        }
        if (open < n){
            backGenerateParenthesis(n,res,s+"(",open+1,close);
        }
        if (close < open){
            backGenerateParenthesis(n,res,s+")",open,close+1);
        }
    }
}

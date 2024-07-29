package com.sniper.leetcodereview.solution.leetcode.topic_5;

/**
 * @Description 最长回文子串
 * @Author sniper
 * @Date 2024/7/1 3:55 PM
 **/
public class Solution {
    // 动态规划
    public static String longestPalindrome(String s) {
        int len = s.length();
        boolean[][] dp = new boolean[len][len];

        for (int i = 0; i < len; i++) {
            dp[i][i] = true;
        }

        int max = 0;
        int start = 0;
        for (int L = 1; L <= len; L++) {
            for (int left = 0; left < len; left++) {
                int right = left + L - 1;
                if (right >= len){
                    break;
                }
                if (s.charAt(left) == s.charAt(right)){
                    if (L <= 3){
                        dp[left][right] = true;
                    }else {
                        dp[left][right] = dp[left+1][right-1];
                    }
                }else{
                    dp[left][right] = false;
                }
                if (dp[left][right] && L > max){
                    max = L;
                    start = left;
                }
            }
        }
        return s.substring(start,start+max);


    }
}

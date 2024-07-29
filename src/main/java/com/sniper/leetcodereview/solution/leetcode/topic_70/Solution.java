package com.sniper.leetcodereview.solution.leetcode.topic_70;

/**
 * @Description
 * @Author sniper
 * @Date 2024/7/24 11:45 AM
 **/
public class Solution {
    // 动态规划
    public static int climbStairs(int n) {
        if (n == 1){
            return 1;
        }
        if (n == 2){
            return 2;
        }
        int[] dp = new int[n];
        dp[0] = 1;
        dp[1] = 2;
        for (int i = 2; i < n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n-1];
    }
}

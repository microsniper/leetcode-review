package com.sniper.leetcodereview.solution.leetcode0_100.topic_70;

/**
 * @Description
 * @Author sniper
 * @Date 2024/7/24 11:45 AM
 **/
public class Solution {

    public static int climbStairs(int n) {

        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[0] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
}

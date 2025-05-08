package com.sniper.leetcodereview.solution.leetcode200.topic_279;

import java.util.Arrays;

/**
 * sniper
 * 2025/4/13 下午12:22
 */
public class Solution {
    public int numSquares(int n) {
        int[] dp = new int[n+1];

        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0] = 0;

        for (int i=1; i<=n; i++) {
            for (int j=1; j*j<=i; j++) {
                dp[i] = Math.min(dp[i], dp[i - j*j] + 1);
            }
        }
        return dp[n];
    }
}

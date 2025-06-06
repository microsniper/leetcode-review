package com.sniper.leetcodereview.solution.leetcode200.topic_198;

/**
 * sniper
 * 2025/3/29 下午8:05
 */
public class Solution {
    public int rob(int[] nums) {
        int len = nums.length;

        if (len == 1) {
            return nums[0];
        }
        int[] dp = new int[len];
        dp[0] = nums[0];
        dp[1] = Math.max(dp[0], nums[1]);

        for (int i=2; i<len; i++) {
            dp[i] = Math.max(dp[i-1], dp[i-2] + nums[i]);
        }
        return dp[len-1];
    }
}

package com.sniper.leetcodereview.solution.leetcode200.topic_121;

/**
 * sniper
 * 2025/4/10 上午7:31
 */
public class Solution {
    public int maxProfit(int[] prices) {
        int len = prices.length;

        int minPrice = prices[0];
        int max = Integer.MIN_VALUE;

        for (int i=0; i<len; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else {
                max = Math.max(max, prices[i] - minPrice);
            }
        }
        return max;

    }
}

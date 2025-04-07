package com.sniper.leetcodereview.solution.leetcode.topic_136;

/**
 * sniper
 * 2025/3/23 上午12:01
 */
public class Solution {
    public int singleNumber(int[] nums) {
        int res = 0;
        for (int num : nums) {
            res ^= num;
        }
        return res;
    }
}

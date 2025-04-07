package com.sniper.leetcodereview.solution.leetcode.topic_238;

/**
 * sniper
 * 2025/3/23 下午5:37
 */
public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;

        int[] res = new int[len];
        res[0] = 1;
        for (int i=1; i<len; i++) {
            res[i] = res[i-1] * nums[i-1];
        }

        int right = 1;
        for (int i=len-1; i>=0; i--) {
            res[i] = right * res[i];
            right = right * nums[i];
        }
        return res;
    }
}

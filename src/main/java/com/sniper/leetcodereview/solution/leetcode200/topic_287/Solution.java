package com.sniper.leetcodereview.solution.leetcode200.topic_287;

import java.util.Arrays;

/**
 * sniper
 * 2025/4/12 下午6:59
 */
public class Solution {
    public int findDuplicate(int[] nums) {
        int len = nums.length;
        int res = -1;
        Arrays.sort(nums);
        for (int i=0; i<len; i++) {
            if (nums[i] == res) {
                return nums[i];
            } else {
                res = nums[i];
            }
        }
        return -1;
    }
}

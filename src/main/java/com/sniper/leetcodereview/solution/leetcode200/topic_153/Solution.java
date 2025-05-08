package com.sniper.leetcodereview.solution.leetcode200.topic_153;

/**
 * sniper
 * 2025/4/9 上午6:52
 */
public class Solution {
    public int findMin(int[] nums) {
        int len = nums.length;
        if (len == 1) {
            return nums[0];
        }

        int left = 0;
        int right = len - 1;
        if (nums[0] < nums[len - 1]) {
            // 正序
            return nums[0];
        } else {

            while (left < right) {
                int mid = left + (right - left) / 2;
                if (nums[mid] >= nums[0]) {
                    left = mid + 1;
                } else {
                    right = mid;
                }
            }
        }
        return nums[left];
    }
}

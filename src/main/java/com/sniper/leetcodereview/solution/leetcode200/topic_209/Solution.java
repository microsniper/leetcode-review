package com.sniper.leetcodereview.solution.leetcode200.topic_209;

/**
 * sniper
 * 2025/4/17 上午7:10
 */
public class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int len = nums.length;
        int left = 0;
        int right = 0;
        int sum = 0;
        int minLen = len+1;
        while (left <= right) {
            while (sum < target) {
                if (right >= len) {
                    return minLen == len+1 ? 0 : minLen;
                }
                sum += nums[right];
                right++;
            }
            minLen =  Math.min(minLen, right-left);
            sum -= nums[left];
            left++;
        }
        return minLen;
    }
}

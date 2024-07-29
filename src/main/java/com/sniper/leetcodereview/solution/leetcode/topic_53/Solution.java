package com.sniper.leetcodereview.solution.leetcode.topic_53;

/**
 * @Description
 * @Author sniper
 * @Date 2024/7/19 5:23 PM
 **/
public class Solution {
    // 暴力法
    public static int maxSubArray(int[] nums) {
        int len = nums.length;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < len; i++) {
            int sum = 0;
            for (int j = i; j < len; j++) {
                sum += nums[j];
                max = Math.max(sum,max);
            }
        }
        return max;
    }

    // 动态规划
    public static int maxSubArray2(int[] nums) {
        int len = nums.length;
        int max = nums[0];
        int sum = 0;
        for (int i = 0; i < len; i++) {
            sum = Math.max(nums[i],sum+nums[i]);
            max = Math.max(max,sum);
        }
        return max;

    }
}

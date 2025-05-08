package com.sniper.leetcodereview.solution.leetcode100.topic_45;

/**
 * sniper
 * 2025/4/12 下午4:40
 */
public class Solution {
    public static int jump(int[] nums) {
        int steps = 0;
        int current_max = 0; // 当前步数能到达的最远位置
        int next_max = 0;    // 下一步能到达的最远位置

        for (int i = 0; i < nums.length - 1; i++) {
            next_max = Math.max(next_max, i + nums[i]);
            if (i == current_max) { // 必须跳跃
                steps++;
                current_max = next_max;
            }
        }
        return steps;
    }
}

package com.sniper.leetcodereview.solution.leetcode100.topic_55;

/**
 * @Description 跳跃游戏
 * @Author sniper
 * @Date 2024/7/21 4:56 PM
 **/
public class Solution {

    public boolean canJump(int[] nums) {
        int len = nums.length;
        int rightMost = 0;
        for (int i = 0; i < len; i++) {
            if (i <= rightMost) {
                rightMost = Math.max(i + nums[i], rightMost);
                if (rightMost >= len - 1) {
                    return true;
                }
            }

        }
        return false;
    }
}

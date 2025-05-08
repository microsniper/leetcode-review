package com.sniper.leetcodereview.solution.leetcode100.topic_27;

/**
 * sniper
 * 2025/4/16 上午7:32
 */
public class Solution {
    public int removeElement(int[] nums, int val) {
        int len = nums.length;

        int index = 0;
        for (int i=0; i<len; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
}

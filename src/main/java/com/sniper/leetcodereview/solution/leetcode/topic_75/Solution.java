package com.sniper.leetcodereview.solution.leetcode.topic_75;

/**
 * @Description
 * @Author sniper
 * @Date 2024/7/24 3:49 PM
 **/
public class Solution {
    // 冒泡
    public static void sortColors(int[] nums) {
        int len = nums.length;
        if (len == 1){
            return;
        }
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len-i-1; j++) {
                if (nums[j] > nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
    }
}

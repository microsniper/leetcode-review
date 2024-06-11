package com.sniper.leetcodereview.solution.algorithm.array.topic_283;

/**
 * @Description
 * @Author sniper
 * @Date 2024/5/30 2:16 PM
 **/
public class Solution {
    public static void test(int[] nums) {
        int len = nums.length;
        if (len == 0){
            return;
        }
        int index  = 0;
        for (int i = 0; i < len; i++) {
            if (nums[i] != 0){
                nums[index] = nums[i];
                index++;
            }
        }
        for (int i = index; i < len; i++) {
            nums[i] = 0;
        }
    }
}

package com.sniper.leetcodereview.solution.algorithm.array.topic_27;

/**
 * @Description
 * @Author sniper
 * @Date 2024/5/30 2:25 PM
 **/
public class Solution {
    public int removeElement(int[] nums, int val) {
        if (nums == null || nums.length == 0){
            return 0;
        }
        int len = nums.length;
        int index = 0;
        for (int i = 0; i < len; i++) {
            if (nums[i] != val){
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
}

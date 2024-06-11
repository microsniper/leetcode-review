package com.sniper.leetcodereview.solution.algorithm.binarysearch.topic_704;

import java.util.Arrays;

/**
 * @Description
 * @Author sniper
 * @Date 2024/6/4 11:44 AM
 **/
public class Solution {
    public static int search(int[] nums, int target) {
        int len = nums.length;
        if (len == 0 ){
            return -1;
        }

        Arrays.sort(nums);
        int left = 0;
        int right = len-1;
        while (left <= right){
            int index = left + (right - left) / 2;
            if (nums[index] == target){
                return index;
            }else if (target < nums[index]){
                right = index-1;
            }else{
                left = index+1;
            }
        }
        return -1;
    }
}

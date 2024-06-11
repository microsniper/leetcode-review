package com.sniper.leetcodereview.solution.algorithm.binarysearch.topic_162;

/**
 * @Description
 * @Author sniper
 * @Date 2024/6/4 6:29 PM
 **/
public class Solution {
    public static int findPeakElement(int[] nums) {
        int len = nums.length;

        int left = 0;
        int right = len-1;
        while (left < right){
            int mid = left + (right - left) /2;
            if (nums[mid] < nums[mid+1]){
                left = mid+1;
            }else{
                right = mid;
            }
        }
        return left;

    }
}

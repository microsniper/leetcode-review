package com.sniper.leetcodereview.solution.leetcode100.topic_35;

/**
 * @Description
 * @Author sniper
 * @Date 2024/6/4 3:58 PM
 **/
public class Solution {
    public static int searchInsert(int[] nums, int target) {
        int len = nums.length;
        int left = 0;
        int right = len - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return nums[left] < target ? left + 1 : left;

    }
}

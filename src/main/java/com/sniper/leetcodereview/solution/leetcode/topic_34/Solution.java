package com.sniper.leetcodereview.solution.leetcode.topic_34;

/**
 * @Description
 * @Author sniper
 * @Date 2024/7/19 3:02 PM
 **/
public class Solution {
    // 二分查找
    public static int[] searchRange(int[] nums, int target) {
        int len = nums.length;
        int firstIndex = searchFirst(nums,target);
        int lastIndex = searchLast(nums,target);
        return new int[]{firstIndex,lastIndex};
    }

    private static int searchLast(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right){
            int mid = left + (right - left)/2;
            if (nums[mid] == target){
                if (mid == nums.length-1 || nums[mid] != nums[mid+1]){
                    return mid;
                }else{
                    left = mid+1;
                }
            }else{
                if (nums[mid] < target){
                    left = mid + 1;
                }else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }

    private static int searchFirst(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right){
            int mid = left + (right - left) / 2;
            if (target == nums[mid]){
                if (mid == 0 || nums[mid - 1] != nums[mid]){
                    return mid;
                }else {
                    right = mid - 1;
                }
            }else{
                if (nums[mid] < target){
                    left = mid + 1;
                }else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }
}

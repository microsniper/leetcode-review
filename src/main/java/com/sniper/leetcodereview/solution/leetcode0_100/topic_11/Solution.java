package com.sniper.leetcodereview.solution.leetcode0_100.topic_11;

/**
 * @Description 盛水最多的容器
 * @Author sniper
 * @Date 2024/7/2 7:54 PM
 **/
public class Solution {

    public static int maxArea(int[] height) {
        int len = height.length;
        int left = 0;
        int right = len-1;
        int max = 0;
        while (left < right){
            int space = Math.min(height[left],height[right]) * (right - left);
            max = Math.max(max,space);
            if (height[left] < height[right]){
                left++;
            }else {
                right--;
            }
        }
        return max;
    }
}

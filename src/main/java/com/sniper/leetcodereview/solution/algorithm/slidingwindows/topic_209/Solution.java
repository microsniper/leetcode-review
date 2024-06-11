package com.sniper.leetcodereview.solution.algorithm.slidingwindows.topic_209;

/**
 * @Description
 * @Author sniper
 * @Date 2024/6/6 11:34 AM
 **/
public class Solution {

    // 定长 变长 中最大最小可以使用滑动窗口
    public static int minSubArrayLen(int target, int[] nums) {
        int len = nums.length;

        int minLen = len;
        int left = 0;
        int right = 0;
        int sum = 0;
        boolean flag = false;
        while (left <= right && right < len){
            sum += nums[right];
            if (sum >= target){
                while (sum >= target){
                    flag = true;
                    minLen = Math.min(minLen,right-left+1);
                    sum -= nums[left];
                    left++;
                }
                right++;
            }else{
                right++;
            }
        }
        return flag?minLen:0;

    }

}

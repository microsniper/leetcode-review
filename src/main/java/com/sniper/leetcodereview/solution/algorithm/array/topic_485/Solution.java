package com.sniper.leetcodereview.solution.algorithm.array.topic_485;

/**
 * @Description
 * @Author sniper
 * @Date 2024/5/30 12:09 PM
 **/
public class Solution {
    public static int test(int[] nums) {
        int len = nums.length;
        if (len == 0){
            return 0;
        }
        int max = 0;
        int temp = 0;
        for (int i = 0; i < len; i++) {
            if (nums[i] == 1){
                temp++;
            }else{
                max = Math.max(max,temp);
                temp = 0;
            }
        }
        max = Math.max(max,temp);
        return max;
    }
}

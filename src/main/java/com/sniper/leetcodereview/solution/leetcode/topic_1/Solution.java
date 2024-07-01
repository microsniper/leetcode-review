package com.sniper.leetcodereview.solution.leetcode.topic_1;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description 两数之和
 * @Author sniper
 * @Date 2024/6/30 4:55 PM
 **/
public class Solution {
    /**
     * hash法
     */
    public int[] twoSum(int[] nums, int target) {
        int len = nums.length;

        int[] arr = new int[2];
        Map<Integer,Integer> map = new HashMap<>();
        map.put(target - nums[0],0);
        for(int i=1; i<len; i++){
            if (map.containsKey(nums[i])){
                arr[0] = map.get(nums[i]);
                arr[1] = i;
                return arr;
            }else{
                map.put(target-nums[i],i);
            }
        }
        return null;
    }
}

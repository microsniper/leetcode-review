package com.sniper.leetcodereview.solution.algorithm.hash.topic_1;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description
 * @Author sniper
 * @Date 2024/6/9 11:04 AM
 **/
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int len = nums.length;

        Map<Integer,Integer> map = new HashMap<>();
        map.put(target-nums[0],0);

        for(int i =1; i < len; i++){
            if(map.containsKey(nums[i])){
                return new int[]{map.get(nums[i]),i};
            }else{
                map.put(target-nums[i],i);
            }
        }
        return null;
    }
}

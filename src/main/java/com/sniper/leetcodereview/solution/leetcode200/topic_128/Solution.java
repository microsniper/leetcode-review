package com.sniper.leetcodereview.solution.leetcode200.topic_128;

import java.util.*;

/**
 * @Description 最长连续子序列
 * @Author sniper
 * @Date 2024/7/2 11:38 AM
 **/
public class Solution {
    // O(n)  hash
    public static int longestConsecutive(int[] nums) {
        int len = nums.length;
        Arrays.sort(nums);
        int max = 0;
        Map<Integer, List<Integer>> map = new HashMap<>();
        for(int i=0; i<len; i++){
            if (i != 0 && nums[i-1] == nums[i]){
                continue;
            }
            if (!map.containsKey(nums[i])){
                List<Integer> list = new ArrayList<>();
                list.add(nums[i]);
                map.put(nums[i]+1,list);
                max = Math.max(max,list.size());
            }else {
                List<Integer> list = map.get(nums[i]);
                list.add(nums[i]);
                map.remove(nums[i]);
                map.put(nums[i]+1,list);
                max = Math.max(max,list.size());
            }
        }
        return max;
    }
}

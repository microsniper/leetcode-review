package com.sniper.leetcodereview.solution.leetcode200.topic_560;

import java.util.HashMap;
import java.util.Map;

/**
 * sniper
 * 2025/3/15 下午8:56
 */
public class Solution {
    public int subarraySum(int[] nums, int k) {
        int len = nums.length;

        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int pre = 0;
        int count = 0;
        for (int i=0; i<len; i++) {
            pre += nums[i];
            if (map.containsKey(pre - k)) {
                count += map.get(pre - k);
                // count ++;
            }
            map.put(pre, map.getOrDefault(pre, 0) + 1);
        }
        return count;
    }
}

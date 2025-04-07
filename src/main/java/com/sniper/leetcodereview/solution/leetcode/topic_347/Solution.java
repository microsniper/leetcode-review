package com.sniper.leetcodereview.solution.leetcode.topic_347;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * sniper
 * 2025/3/29 下午5:22
 */
public class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int len = nums.length;
        PriorityQueue<Map.Entry<Integer,Integer>> queue = new PriorityQueue<>((e1, e2) -> {
            return e2.getValue() - e1.getValue();
        });

        Map<Integer,Integer> map = new HashMap<>();
        for (int i=0; i<len; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 1) + 1);
        }

        queue.addAll(map.entrySet());

        int[] res = new int[k];
        for (int i=0; i<k; i++) {
            res[i] = queue.poll().getKey();
        }
        return res;

    }
}

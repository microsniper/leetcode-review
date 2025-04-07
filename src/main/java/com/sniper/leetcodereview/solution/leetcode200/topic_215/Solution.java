package com.sniper.leetcodereview.solution.leetcode200.topic_215;

import java.util.Collections;
import java.util.PriorityQueue;

/**
 * sniper
 * 2025/3/29 下午4:23
 */
public class Solution {
    public int findKthLargest(int[] nums, int k) {
        int len = nums.length;
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

        for (int i=0; i<len; i++) {
            queue.add(nums[i]);
        }
        for (int i=0; i<k-1; i++) {
            queue.poll();
        }
        return queue.poll();
    }
}

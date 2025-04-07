package com.sniper.leetcodereview.solution.leetcode200.topic_189;

import java.util.LinkedList;
import java.util.Queue;

/**
 * sniper
 * 2025/3/18 下午11:01
 */
public class Solution {
    public static void rotate(int[] nums, int k) {
        int len = nums.length;
        if (len == 0 ) {
            return;
        }

        Queue<Integer> queue = new LinkedList<>();
        for (int i=len-1; i >=0; i--) {
            queue.add(nums[i]);
        }
        while (k != 0) {
            Integer poll = queue.poll();
            queue.add(poll);
            k--;
        }

        int count = queue.size();
        for (int i=count -1; i >= 0; i--) {
            nums[i] = queue.poll();
        }
    }
}

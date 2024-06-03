package com.sniper.leetcodereview.solution.algorithm.tree.KthLargestElementInAnArray_215;

import java.util.Collections;
import java.util.PriorityQueue;

/**
 * @Description
 * @Author sniper
 * @Date 2024/6/1 11:43 PM
 **/
public class Solution {
    public int findKthLargest(int[] nums, int k) {
        int len = nums.length;
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0; i<len; i++){
            queue.add(nums[i]);
        }

        int max = 0;
        for(int i=0; i<k; i++){
            max = queue.poll();
        }
        return max;
    }
}

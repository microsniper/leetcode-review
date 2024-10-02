package com.sniper.leetcodereview.solution.leetcode.topic_26;

import java.util.HashSet;
import java.util.Set;

/**
 * @Description 删除有序数组中的重复项
 * @Author sniper
 * @Date 2024/9/23 11:05 PM
 **/
public class Solution {
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        Set<Integer> set = new HashSet<>();
        int index = 0;
        for (int i = 0; i < len; i++) {
            if (!set.contains(nums[i])) {
                set.add(nums[i]);
                nums[index] = nums[i];
                index++;
            }
        }
        return set.size();
    }
}

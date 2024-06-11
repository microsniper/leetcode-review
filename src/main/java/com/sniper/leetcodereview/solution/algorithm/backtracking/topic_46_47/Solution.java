package com.sniper.leetcodereview.solution.algorithm.backtracking.topic_46_47;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @Description
 * @Author sniper
 * @Date 2024/6/11 11:46 PM
 **/
public class Solution {
    public static List<List<Integer>> permute(int[] nums) {
        int len = nums.length;
        Set<List<Integer>> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        boolean[] used = new boolean[len];
        backPermute(nums,len,list,set,used);
        return new ArrayList<>(set);
    }

    // 使用 Boolean 标记法
    private static void backPermute(int[] nums, int len, List<Integer> list, Set<List<Integer>> set, boolean[] used) {
        if (list.size() == len){
            set.add(new ArrayList<>(list));
            return;
        }

        for (int i = 0; i <len; i++) {
            if (!used[i]){
                used[i] = true;
                list.add(nums[i]);
                backPermute(nums,len,list,set,used);
                list.remove(list.size()-1);
                used[i] = false;
            }

        }
    }
}

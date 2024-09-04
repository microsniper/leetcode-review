package com.sniper.leetcodereview.solution.leetcode.topic_78;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @Description
 * @Author sniper
 * @Date 2024/6/11 5:32 PM
 **/
public class Solution {

    public static List<List<Integer>> subsets(int[] nums) {
        int len = nums.length;
        Set<List<Integer>> set = new HashSet<>();
        set.add(new ArrayList<>());
        for (int i = 1; i <= len; i++) {
            List<Integer> list = new ArrayList<>();
            backTracking(len,i,set,list,nums,0);
        }
        return new ArrayList<>(set);

    }

    private static void backTracking(int len, int i, Set<List<Integer>> set, List<Integer> list, int[] nums,int index) {
        if (list.size() == i){
            set.add(new ArrayList<>(list));
            return;
        }

        for (int j = index; j < len; j++) {
            list.add(nums[j]);
            backTracking(len,i,set,list,nums,j+1);
            list.remove(list.size()-1);
        }

    }
}

package com.sniper.leetcodereview.solution.leetcode100.topic_46;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @Description
 * @Author sniper
 * @Date 2024/7/19 4:01 PM
 **/
public class Solution {

    public static List<List<Integer>> permute(int[] nums) {
        Set<List<Integer>> res = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        boolean[] flag = new boolean[nums.length];
        backPermute(res,list,nums,flag);
        return new ArrayList<>(res);
    }

    public static void backPermute(Set<List<Integer>> res,List<Integer> list,int[] nums,boolean[] flag){
        if (list.size() == nums.length){
            res.add(new ArrayList<>(list));
            return;
        }

        for(int i=0; i<nums.length; i++){
            if (!flag[i]){
                flag[i] = true;
                list.add(nums[i]);
                backPermute(res,list,nums,flag);
                list.remove(list.size()-1);
                flag[i] = false;
            }
        }

    }
}

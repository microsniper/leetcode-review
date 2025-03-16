package com.sniper.leetcodereview.solution.leetcode.topic_39;

import java.util.*;

/**
 * @Description 组合总和
 * @Author sniper
 * @Date 2024/7/19 3:29 PM
 **/
public class Solution {

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        int len = candidates.length;
        Set<List<Integer>> res = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        backTrace(res,candidates,target,0,list);
        return new ArrayList<>(res);
    }

    public static void backTrace(Set<List<Integer>> res,int[] candidates,int target,int sum,List<Integer> list){
        if (sum == target){
            ArrayList<Integer> arrayList = new ArrayList<>(list);
            Collections.sort(arrayList);
            res.add(arrayList);
            return;
        }
        if (sum > target){
            return;
        }
        for(int i=0; i<candidates.length; i++){
            sum += candidates[i];
            list.add(candidates[i]);
            backTrace(res,candidates,target,sum,list);
            sum -= candidates[i];
            list.remove(list.size()-1);
        }
    }
}

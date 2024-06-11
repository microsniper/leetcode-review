package com.sniper.leetcodereview.solution.algorithm.backtracking.topic_77;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @Description
 * @Author sniper
 * @Date 2024/6/11 6:19 PM
 **/
public class Solution {
    public static List<List<Integer>> combine(int n, int k) {
        Set<List<Integer>> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        backCombine(k,set,list,0,n);
        return new ArrayList<>(set);
    }

    private static void backCombine(int k, Set<List<Integer>> set, List<Integer> list, int i,int n) {
        if (list.size() == k){
            set.add(new ArrayList<>(list));
            return;
        }

        for (int j = i; j <n; j++) {
            list.add(j+1);
            backCombine(k,set,list,j+1,n);
            list.remove(list.size()-1);
        }
    }
}

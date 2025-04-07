package com.sniper.leetcodereview.solution.leetcode200.topic_118;

import java.util.ArrayList;
import java.util.List;

/**
 * sniper
 * 2025/3/29 下午6:54
 */
public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();


        for (int i=0; i< numRows; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j=0; j<=i; j++) {
                if (j == 0 || j == i) {
                    list.add(1);
                } else {
                    list.add(res.get(i-1).get(j-1) + res.get(i-1).get(j));

                }

            }
            res.add(list);
        }
        return res;
    }
}

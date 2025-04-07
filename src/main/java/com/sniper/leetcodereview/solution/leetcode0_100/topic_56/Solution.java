package com.sniper.leetcodereview.solution.leetcode0_100.topic_56;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Description
 * @Author sniper
 * @Date 2024/7/21 10:59 PM
 **/
public class Solution {

    public int[][] merge(int[][] intervals) {
        int len = intervals.length;
        if (intervals == null || intervals.length < 2){
            return intervals;
        }

        List<int[]> res = new ArrayList<>();
        Arrays.sort(intervals,(a,b)-> a[0]-b[0]);

        for(int[] arr:intervals){
            if(res.size() == 0 || res.get(res.size()-1)[1] < arr[0]){
                res.add(arr);
            }else{
                res.get(res.size()-1)[1] = Math.max(res.get(res.size()-1)[1],arr[1]);
            }
        }
        return res.toArray(new int[res.size()][]);
    }
}

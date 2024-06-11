package com.sniper.leetcodereview.solution.algorithm.heap.topic_692;

import java.util.*;

/**
 * @Description
 * @Author sniper
 * @Date 2024/6/3 11:50 AM
 **/
public class Solution {
    public static List<String> topKFrequent(String[] words, int k) {
        List<String> list = new ArrayList<>();

        int len = words.length;
        if (len == 0){
            return list;
        }
        Map<String,Integer> map = new HashMap<>();

        for (int i = 0; i < len; i++) {
            map.put(words[i],map.getOrDefault(words[i],0)+1);
        }
        // 最大堆
        PriorityQueue<Map.Entry<String,Integer>> heap = new PriorityQueue<>((a, b) -> {
            if (a.getValue().equals(b.getValue())){
                return a.getKey().compareTo(b.getKey());
            }else{
                return b.getValue() - a.getValue();
            }
        });

        heap.addAll(map.entrySet());

        while (!heap.isEmpty() && k > 0){
            list.add(heap.poll().getKey());
            k--;
        }
        return list;

    }
}

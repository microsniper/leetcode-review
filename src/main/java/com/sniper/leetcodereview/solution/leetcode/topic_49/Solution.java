package com.sniper.leetcodereview.solution.leetcode.topic_49;

import java.util.*;

/**
 * @Description 字母异位词分组
 * @Author sniper
 * @Date 2024/7/2 12:15 AM
 **/
public class Solution {
    // hash
    public List<List<String>> groupAnagrams(String[] strs) {
        int len = strs.length;

        Map<String,List<String>> map = new HashMap<>();
        for(String str : strs){
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            String s = new String(ch);
            List<String> list = map.getOrDefault(s,new ArrayList<>());
            list.add(str);
            map.put(s,list);
        }
        return new ArrayList<>(map.values());
    }

}

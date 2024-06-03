package com.sniper.leetcodereview.solution.algorithm.Hash.FindTheDifference_389;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description
 * @Author sniper
 * @Date 2024/6/1 10:28 PM
 **/
public class Solution {
    public char findTheDifference(String s, String t) {
        int len = s.length();
        int len2 = t.length();

        Map<Character,Integer> map = new HashMap<>();
        for(int i=0; i<len; i++){
            if (!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),1);
            }else{
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }

        }

        for(int i =0; i<len2; i++){
            if (!map.containsKey(t.charAt(i))){
                return t.charAt(i);
            }else{
                map.put(t.charAt(i),map.get(t.charAt(i))-1);
            }
        }
        for(Map.Entry<Character,Integer> entry :  map.entrySet()){
            if (entry.getValue() != 0){
                return entry.getKey();
            }
        }
        return t.charAt(0);
    }
}

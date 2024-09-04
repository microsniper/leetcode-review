package com.sniper.leetcodereview.solution.algorithm.hash.topic_389;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description
 * @Author sniper
 * @Date 2024/6/1 10:28 PM
 **/
public class Solution {
    public char findTheDifference(String s, String t) {
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            if (!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),1);
            }else{
                Integer num = map.get(s.charAt(i));
                map.put(s.charAt(i),num+1);
            }
        }

        for(int i=0; i<t.length(); i++){
            if (!map.containsKey(t.charAt(i))){
                return t.charAt(i);
            }else{
                Integer num = map.get(t.charAt(i));
                if (num == 0){
                    return t.charAt(i);
                }else{
                    map.put(t.charAt(i),num-1);
                }

            }
        }
        return t.charAt(0);
    }
}

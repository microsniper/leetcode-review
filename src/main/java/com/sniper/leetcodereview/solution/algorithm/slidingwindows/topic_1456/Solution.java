package com.sniper.leetcodereview.solution.algorithm.slidingwindows.topic_1456;

import java.util.HashSet;
import java.util.Set;

/**
 * @Description
 * @Author sniper
 * @Date 2024/6/6 3:54 PM
 **/
public class Solution {
    public static int maxVowels(String s, int k) {
        int len = s.length();
        Set<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        int max = 0;
        int left =0;
        int right = 0;
        int temp = 0;
        while (left <= right && right < len){
            while (right - left + 1 <= k){
                if (set.contains(s.charAt(right))){
                    temp++;
                }
                right++;
            }
            max = Math.max(temp,max);
            if (set.contains(s.charAt(left))){
                temp--;
            }
            left++;
        }
        return max;
    }
}

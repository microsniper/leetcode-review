package com.sniper.leetcodereview.solution.leetcode0_100.topic_3;

import java.util.HashSet;
import java.util.Set;

/**
 * @Description 无重复字符的最长子串
 * @Author sniper
 * @Date 2024/6/30 7:12 PM
 **/
public class Solution {

    public int lengthOfLongestSubstring(String s) {
        int len = s.length();

        if (len == 0){
            return 0;
        }
        int left = 0;
        int right = 0;
        int max = 0;
        Set<Character> set = new HashSet<>();
        while(left <= right && right < len){
            if (!set.contains(s.charAt(right))){
                set.add(s.charAt(right));
                right++;
                max = Math.max(max,set.size());
            }else{
                max = Math.max(max,set.size());
                while(left <= right && set.contains(s.charAt(right))){
                    set.remove(s.charAt(left));
                    left++;
                }
            }

        }
        return max;
    }
}

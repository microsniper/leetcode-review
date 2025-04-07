package com.sniper.leetcodereview.solution.leetcode0_100.topic_14;

/**
 * sniper
 * 2025/4/2 上午11:59
 */
public class Solution {
    public static String test(String[] strs) {
        int len = strs.length;
        if (len == 0) {
            return "";
        }

        String s = strs[0];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            for (int j = 1; j < len; j++) {
                String str = strs[j];
                if (i >= str.length()) {
                    return sb.toString();
                }
                if (str.charAt(i) != s.charAt(i)) {
                    return sb.toString();
                }
            }
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}

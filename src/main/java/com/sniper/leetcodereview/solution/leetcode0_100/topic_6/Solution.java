package com.sniper.leetcodereview.solution.leetcode0_100.topic_6;

import java.util.ArrayList;
import java.util.List;

/**
 * sniper
 * 2025/3/11 下午11:33
 */
public class Solution {

    public String convert(String s, int numRows) {
        int len = s.length();
        if (numRows == 1) {
            return s;
        }

        List<List<Character>> list = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            list.add(new ArrayList<>());
        }

        int num = numRows;
        int add = 1;
        for (int i = 0; i < len; i++) {
            List<Character> l = list.get(num - 1);
            l.add(s.charAt(i));
            if (num == 1) {
                add = -1;
            } else if (num == numRows) {
                add = 1;
            }
            num = num - add;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = numRows - 1; i >= 0; i--) {
            List<Character> l = list.get(i);
            for (Character c : l) {
                sb.append(c);
            }

        }
        return sb.toString();
    }

}

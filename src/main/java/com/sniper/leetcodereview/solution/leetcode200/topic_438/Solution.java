package com.sniper.leetcodereview.solution.leetcode200.topic_438;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * sniper
 * 2025/3/12 下午11:41
 */
public class Solution {

    public List<Integer> findAnagrams(String s, String p) {
        int lens = s.length();
        int lenp = p.length();
        if (lens < lenp) {
            return new ArrayList<>();
        }
        int sums = 0;
        for (int i=0;i<lenp; i++) {
            sums += p.charAt(i);
        }
        char[] chp = p.toCharArray();
        Arrays.sort(chp);
        String pStr = new String(chp);

        int left = 0;
        int right = 0;
        int sump = 0;
        List<Integer> res = new ArrayList<>();
        while (left <= right && right < lens) {
            while (right - left + 1 <= lenp) {
                sump += s.charAt(right);
                right ++;
            }
            if (sums == sump) {
                char[] chs = s.substring(left,right).toCharArray();
                Arrays.sort(chs);
                String sStr = new String(chs);
                if (sStr.equals(pStr)) {
                    res.add(left);
                }

            }
            sump -= s.charAt(left);
            left++;


        }
        return res;
    }
}

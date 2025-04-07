package com.sniper.leetcodereview.solution.leetcode200.topic_131;

import java.util.ArrayList;
import java.util.List;

/**
 * sniper
 * 2025/4/7 下午2:30
 */
public class Solution {
    public static List<List<String>> partition(String s) {
        int len = s.length();

        boolean[][] dp = new boolean[len][len];
        List<List<String>> res = new ArrayList<>();
        List<String> list = new ArrayList<>();

        for (int i=len; i>=0; i--) {
            for (int j=i; j<len; j++) {
                if (s.charAt(i) == s.charAt(j) && (j-i+1 <= 2 || dp[i+1][j-1])) {
                    dp[i][j] = true;
                }
            }
        }

        partitionBack(s, 0, dp, res, list);
        return res;
    }

    public static void partitionBack(String s, int start, boolean[][] dp, List<List<String>> res, List<String> list) {
        if (start == s.length()) {
            res.add(new ArrayList<>(list));
            return;
        }

        for (int end=start; end<s.length(); end++) {
            if (dp[start][end]) {
                list.add(s.substring(start, end+1));
                partitionBack(s, end + 1,dp,  res, list);
                list.remove(list.size()-1);
            }
        }
    }
}

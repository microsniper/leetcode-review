package com.sniper.leetcodereview.solution.leetcode200.topic_139;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * sniper
 * 2025/4/13 下午6:39
 */
public class Solution {
    public static boolean wordBreak(String s, List<String> wordDict) {
        Set<String> wordSet = new HashSet<>(wordDict);
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && wordSet.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break; // 剪枝优化
                }
            }
        }
        return dp[s.length()];
    }
}

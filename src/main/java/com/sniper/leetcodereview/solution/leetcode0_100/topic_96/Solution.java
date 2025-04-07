package com.sniper.leetcodereview.solution.leetcode0_100.topic_96;

/**
 * @Description
 * @Author sniper
 * @Date 2024/7/31 3:57 PM
 **/
public class Solution {

    public static int numTrees(int n) {
        int[] f = new int[n+1];
        f[0] = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                f[i] += f[j-1] * f[i-j];
            }
        }
        return f[n];
    }
}

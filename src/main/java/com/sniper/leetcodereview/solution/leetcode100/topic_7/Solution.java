package com.sniper.leetcodereview.solution.leetcode100.topic_7;

/**
 * sniper
 * 2025/3/12 下午5:27
 */
public class Solution {
    public static int test(int x) {
        int flag = 1;
        if (x < 0) {
            x = -x;
            flag = -1;
        }

        long ans = 0;
        while (x != 0) {
            ans = ans * 10 + x % 10;
            x = x / 10;
        }
        if (ans > Integer.MAX_VALUE || ans < Integer.MIN_VALUE) {
            return 0;
        }
        return (int) ans * flag;
    }

    public static int test2(int x) {
        int a = 1;
        long xx = x;
        if (xx < 0) {
            a = -1;
            xx = -xx;
        }


        int length = String.valueOf(xx).length();
        long sum = 0;
        for (int i=0; i<length; i++) {
            long b = xx % 10;
            sum = sum * 10 + b;
            xx = xx / 10;
        }
        if (sum > Integer.MAX_VALUE) {
            return 0;
        }
        return (int) sum * a;
    }
}

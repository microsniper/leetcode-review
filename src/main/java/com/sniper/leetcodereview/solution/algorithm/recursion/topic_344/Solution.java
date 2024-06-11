package com.sniper.leetcodereview.solution.algorithm.recursion.topic_344;

/**
 * @Description
 * @Author sniper
 * @Date 2024/6/7 2:33 PM
 **/
public class Solution {
    public static void reverseString(char[] s) {
        reverseBack(s,0,s.length-1);
    }

    private static void reverseBack(char[] s, int i,int n) {
        if (i == (s.length-1)/2){
            char ch = s[i];
            s[i] = s[n];
            s[n] = ch;
            return;
        }
        reverseBack(s, i + 1,n-1);
        char ch = s[i];
        s[i] = s[n];
        s[n] = ch;
    }
}

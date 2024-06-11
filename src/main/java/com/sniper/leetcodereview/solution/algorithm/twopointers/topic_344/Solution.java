package com.sniper.leetcodereview.solution.algorithm.twopointers.topic_344;

/**
 * @Description
 * @Author sniper
 * @Date 2024/6/7 11:34 AM
 **/
public class Solution {
    public static void reverseString(char[] s) {
        int len = s.length;
        int left = 0;
        int right = len-1;
        while (left <= right){
            char ch = s[left];
            s[left] = s[right];
            s[right] = ch;
            left++;
            right--;
        }
    }
}

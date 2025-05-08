package com.sniper.leetcodereview.solution.leetcode200.topic_739;

import java.util.Stack;

/**
 * sniper
 * 2025/4/10 上午6:59
 */
public class Solution {


    // 栈
    public static int[] dailyTemperatures2(int[] temperatures) {
        int n = temperatures.length;
        int[] answer = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int j = stack.pop();
                answer[j] = i - j;
            }
            stack.push(i);
        }
        return answer;
    }

    // 超时
    public int[] dailyTemperatures(int[] temperatures) {
        int len = temperatures.length;

        int[] res = new int[len];
        int index = 0;

        for (int i=0; i<len; i++) {
            int temp = temperatures[i];

            for (int j=i; j<len; j++) {
                if (temperatures[j] > temp) {
                    res[index] = j - i;
                    break;
                }
            }
            index ++;
        }
        return res;
    }
}

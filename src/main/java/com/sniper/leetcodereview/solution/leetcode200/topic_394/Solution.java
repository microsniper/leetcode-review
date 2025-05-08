package com.sniper.leetcodereview.solution.leetcode200.topic_394;

import java.util.Stack;

/**
 * sniper
 * 2025/4/9 上午7:33
 */
public class Solution {
    public static String decodeString(String s) {
        Stack<Integer> numStack = new Stack<>();
        Stack<StringBuilder> strStack = new Stack<>();
        StringBuilder res = new StringBuilder();
        int multi = 0;

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                multi = multi * 10 + c -'0' ;
            } else if (c == '[') {
                numStack.push(multi);
                strStack.push(res);
                multi = 0;
                res = new StringBuilder();
            } else if (c == ']') {
                Integer num = numStack.pop();
                StringBuilder str = strStack.pop();
                for (int i=0; i<num; i++) {
                    str.append(res);
                }
                res = str;
            } else {
                res.append(c);
            }
        }
        return res.toString();
    }
}

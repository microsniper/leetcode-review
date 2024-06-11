package com.sniper.leetcodereview.solution.algorithm.stack.topic_20;

import java.util.Stack;

/**
 * @Description
 * @Author sniper
 * @Date 2024/5/31 12:01 AM
 **/
public class Solution {
    public static boolean isValid(String s) {
        int len = s.length();
        if (len == 0){
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == '('){
                stack.push(')');
            }else if(s.charAt(i) == '['){
                stack.push(']');
            }else if (s.charAt(i) == '{'){
                stack.push('}');
            }else if (stack.isEmpty() || stack.pop() != s.charAt(i)){
                return false;
            }
        }
        return true;
    }
}

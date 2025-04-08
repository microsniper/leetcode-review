package com.sniper.leetcodereview.solution.leetcode100.topic_20;

import java.util.Stack;

/**
 * @Description 有效的括号
 * @Author sniper
 * @Date 2024/7/3 4:52 PM
 **/
public class Solution {
    // 常规
    public static boolean isValid(String s) {
        int len = s.length();
        for (int i = 0; i < len; i++) {
            s = s.replace("()", "").replace("[]", "").replace("{}","");
        }
        return s.length() == 0;
    }


    // 栈
    public static boolean isValid2(String s) {
        int len = s.length();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == '('){
                stack.push(')');
            }else if (s.charAt(i) == '['){
                stack.push(']');
            }else if (s.charAt(i) == '{'){
                stack.push('}');
            }else if (stack.isEmpty() || stack.pop() != s.charAt(i)){
                return false;
            }
        }
        return stack.isEmpty();
    }


}

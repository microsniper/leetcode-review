package com.sniper.leetcodereview.solution.leetcode.topic_155;

import java.util.Stack;

/**
 * sniper
 * 2025/3/22 下午11:04
 */
public class Solution {
    private static Stack<Integer> stack = new Stack<>();
    private static Stack<Integer> minStack = new Stack<>();
    public Solution() {
        minStack.push(Integer.MAX_VALUE);
    }

    public void push(int val) {
        stack.push(val);
        minStack.push(Math.min(val, minStack.peek()));
    }

    public void pop() {
        stack.pop();
        minStack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}

package com.sniper.leetcodereview.solution.algorithm.recursion.topic_509;

/**
 * @Description
 * @Author sniper
 * @Date 2024/6/7 10:30 AM
 **/
public class Solution {
    public static int fib(int n) {
        if (n == 0){
            return 0;
        }
        if (n == 1){
            return 1;
        }
        return  fib(n-1) + fib(n-2);
    }
}

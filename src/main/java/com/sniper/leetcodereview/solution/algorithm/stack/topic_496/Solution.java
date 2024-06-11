package com.sniper.leetcodereview.solution.algorithm.stack.topic_496;

import java.util.Stack;

/**
 * @Description
 * @Author sniper
 * @Date 2024/6/1 7:47 PM
 **/
public class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;

        Stack<Integer> stack = new Stack<>();
        Stack<Integer> temp = new Stack<>();
        int[] arr = new int[len1];

        // 入栈
        for(int i=0; i<len2; i++){
            stack.push(nums2[i]);
        }

        int max = -1;
        for(int i =0; i<len1; i++){
            while(!stack.isEmpty()){
                int num = stack.pop();
                if (nums1[i] < num){
                    max = num;
                    temp.push(num);
                }else if (num == nums1[i]){
                    arr[i] = max;
                    temp.push(num);
                    break;
                }else{
                    temp.push(num);
                }
            }
            max = -1;
            while(!temp.isEmpty()){
                stack.push(temp.pop());
            }

        }
        return arr;
    }
}

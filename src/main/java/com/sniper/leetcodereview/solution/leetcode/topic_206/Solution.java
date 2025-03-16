package com.sniper.leetcodereview.solution.leetcode.topic_206;

import java.util.Stack;

/**
 * @Description
 * @Author sniper
 * @Date 2024/5/30 2:47 PM
 **/
public class Solution {
    public static ListNode test(ListNode head) {
        if (head == null){
            return head;
        }

        Stack<Integer> stack = new Stack<>();
        while (head != null){
            stack.push(head.val);
            head = head.next;
        }
        ListNode temp = new ListNode(0);
        ListNode res = temp;
        while (!stack.empty()){
            temp.next = new ListNode(stack.pop());
            temp = temp.next;
        }

        return res.next;
    }

    public static class ListNode{
        ListNode next;

        int val;

        ListNode(int val){
            this.val = val;
        }
    }
}

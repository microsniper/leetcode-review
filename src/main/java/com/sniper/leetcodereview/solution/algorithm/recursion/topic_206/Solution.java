package com.sniper.leetcodereview.solution.algorithm.recursion.topic_206;

/**
 * @Description
 * @Author sniper
 * @Date 2024/6/7 11:17 AM
 **/
public class Solution {
    public static ListNode reverseList(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }
        ListNode node = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return node;
    }

    public static class ListNode{
        ListNode next;

        int val;

        ListNode(int val){
            this.val = val;
        }
    }
}

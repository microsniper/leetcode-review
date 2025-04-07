package com.sniper.leetcodereview.solution.leetcode.topic_19;

/**
 * @Description 删除链表倒数第n个节点
 * @Author sniper
 * @Date 2024/7/3 4:12 PM
 **/
public class Solution {

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null){
            return null;
        }
        ListNode first = head;
        ListNode res = new ListNode(0);
        res.next = head;
        ListNode second = res;
        for (int i = 0; i < n; i++) {
            first = first.next;
        }
        while (first != null){
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;

        return res.next;

    }

    public ListNode removeNthFromEnd2(ListNode head, int n) {

        int a = n;
        ListNode node = new ListNode(0);
        node.next = head;
        ListNode left = node;
        ListNode res = node;
        ListNode right = node;
        while (a != 0) {
            right = right.next;
            a --;
        }

        while (right != null && right.next != null){
            System.out.println(left.val);
            right = right.next;
            left = left.next;

        }


        left.next = left.next.next;
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

package com.sniper.leetcodereview.solution.algorithm.linkedlist.RemoveLinkedListElements_203;

/**
 * @Description
 * @Author sniper
 * @Date 2024/5/30 2:30 PM
 **/
public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null){
            return head;
        }
        ListNode temp = new ListNode(-1);
        temp.next = head;
        ListNode prev = temp;
        while (head != null){
            if (head.val == val){
                prev.next = head.next;
                head = head.next;
            }else{
                prev = head;
                head = head.next;
            }
        }
        return temp.next;
    }

    public static class ListNode{
        ListNode next;

        int val;

        ListNode(int val){
            this.val = val;
        }
    }
}

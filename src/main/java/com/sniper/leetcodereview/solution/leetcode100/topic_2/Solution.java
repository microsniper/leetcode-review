package com.sniper.leetcodereview.solution.leetcode100.topic_2;

/**
 * @Description 两数相加
 * @Author sniper
 * @Date 2024/6/30 6:02 PM
 **/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class Solution {
    /**
     * 常规
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode res = new ListNode(0);
        ListNode result = res;
        int next = 0;
        while(l1 != null || l2 != null || next != 0){
            int val1 = l1 != null ? l1.val : 0;
            int val2 = l2 != null ? l2.val : 0;
            int sum = val1 + val2 + next;
            res.next = new ListNode(sum % 10);
            res = res.next;
            next = sum / 10;
            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
        }
        return result.next;
    }

    /**
     * 递归
     */
    public ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(0);
        ListNode temp = res;
        int next = 0;
        backTrace(l1,l2,next,temp);
        return res.next;
    }
    public void backTrace(ListNode l1,ListNode l2,int next,ListNode temp){
        if (l1 == null && l2 == null && next == 0){
            return;
        }

        int val1 = l1 != null ? l1.val : 0;
        int val2 = l2 != null ? l2.val : 0;
        int sum = val1 + val2 + next;
        temp.next = new ListNode(sum % 10);
        next = sum / 10;
        temp = temp.next;
        l1 = l1 != null ? l1.next : null;
        l2 = l2 != null ? l2.next : null;
        backTrace(l1,l2,next,temp);
    }

     public static class ListNode {
      int val;
      ListNode next;
     ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
}

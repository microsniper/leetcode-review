package com.sniper.leetcodereview.solution.leetcode.topic_24;

/**
 * sniper
 * 2025/3/23 下午9:30
 */
public class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode res = new ListNode();
        res.next = head;
        ListNode current = res;
        while (current != null && current.next != null && current.next.next != null) {
            ListNode f = current;
            ListNode s = current.next;
            ListNode t = current.next.next;

            f.next = t;
            s.next = t.next;
            t.next = s;

            current = current.next.next;
        }
        return res.next;
    }

     public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
}

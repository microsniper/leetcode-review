package com.sniper.leetcodereview.solution.leetcode200.topic_148;

import java.util.PriorityQueue;

/**
 * sniper
 * 2025/4/13 下午12:41
 */
public class Solution {
    public ListNode sortList(ListNode head) {
        PriorityQueue<ListNode> queue = new PriorityQueue<>((e1, e2) -> {
            return e1.val - e2.val;
        });

        while(head != null) {
            queue.add(head);
            head = head.next;
        }

        ListNode res = new ListNode();
        ListNode result = res;
        while (!queue.isEmpty()) {
            ListNode node =  queue.poll();
            res.next = new ListNode(node.val);
            res = res.next;
        }
        return result.next;
    }

     public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
}

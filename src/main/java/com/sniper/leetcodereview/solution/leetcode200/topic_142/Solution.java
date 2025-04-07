package com.sniper.leetcodereview.solution.leetcode200.topic_142;

import java.util.ArrayList;
import java.util.List;

/**
 * sniper
 * 2025/3/17 下午11:17
 */
public class Solution {

    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }

        List<ListNode> list = new ArrayList<>();
        while (head != null) {
            if (!list.contains(head)) {
                list.add(head);
            } else {
                for (int i =0; i<list.size(); i++) {
                    if (list.get(i) == head) {
                        return list.get(i);
                    }
                }
            }
            head = head.next;
        }
        return null;
    }

    public static class ListNode{
        ListNode next;

        int val;

        ListNode(int val){
            this.val = val;
        }
    }
}

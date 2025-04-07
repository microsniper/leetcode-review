package com.sniper.leetcodereview.solution.leetcode200.topic_141;

import java.util.HashSet;
import java.util.Set;

/**
 * sniper
 * 2025/3/16 下午11:13
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }

        Set<ListNode> set = new HashSet<>();
        while (head != null) {
            if (!set.contains(head)) {
                set.add(head);
                head = head.next;
            } else {
                return true;
            }

        }
        return false;

    }

    public static class ListNode{
        ListNode next;

        int val;

        ListNode(int val){
            this.val = val;
        }
    }
}

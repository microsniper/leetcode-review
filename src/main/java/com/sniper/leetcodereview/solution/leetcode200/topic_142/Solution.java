package com.sniper.leetcodereview.solution.leetcode200.topic_142;

import com.sniper.leetcodereview.AlgorithmTest;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * sniper
 * 2025/3/17 下午11:17
 */
public class Solution {

    public ListNode detectCycle(ListNode head) {
        if (head == null) {
            return null;
        }
        Set<ListNode> set = new HashSet<>();
        while (head != null) {
            if (!set.contains(head)) {
                set.add(head);
            } else {
                return head;
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

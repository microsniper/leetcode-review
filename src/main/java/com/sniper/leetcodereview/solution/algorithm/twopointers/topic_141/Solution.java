package com.sniper.leetcodereview.solution.algorithm.twopointers.topic_141;

import java.util.HashSet;
import java.util.Set;

/**
 * @Description
 * @Author sniper
 * @Date 2024/6/3 5:19 PM
 **/
public class Solution {
    public static class ListNode{
        ListNode next;

        int val;

        ListNode(int val){
            this.val = val;
        }
    }
    // 双指针 快慢指针
    public static boolean test2(ListNode head) {
        if (head == null){
            return false;
        }
        if (head.next == null){
            return false;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (slow != null && fast != null){
            fast = fast.next;
            if (fast == slow){
                return true;
            }else{
                fast = fast != null? fast.next : null;
                if (fast == slow) {
                    return true;
                }
            }
            slow = slow != null ? slow.next : null;
        }
        return false;
    }

    // 集合比较地址
    public static boolean test(ListNode head) {
        if (head == null){
            return false;
        }
        Set<ListNode> set = new HashSet<>();
        while (head != null){
            if (!set.contains(head)){
                set.add(head);
            }else{
                return true;
            }
            head = head.next;
        }
        return false;
    }
}

package com.sniper.leetcodereview.solution.leetcode0_100.topic_21;

/**
 * @Description 合并两个有序链表
 * @Author sniper
 * @Date 2024/7/4 4:35 PM
 **/
public class Solution {

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null){
            return list2;
        }else if (list2 == null){
            return list1;
        }else if (list1.val < list2.val){
            list1.next = mergeTwoLists(list1.next,list2);
            return list1;
        }else {
            list2.next = mergeTwoLists(list1,list2.next);
            return list2;
        }
    }

    public static class ListNode{
        ListNode next;

        int val;

        ListNode(int val){
            this.val = val;
        }
    }
}

package com.sniper.leetcodereview.solution.leetcode200.topic_234;

/**
 * sniper
 * 2025/3/16 下午10:18
 */
public class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null) {
            return false;
        }

        StringBuilder sb = new StringBuilder();
        while (head != null) {
            sb.append(head.val);
            head = head.next;
        }

        return palindrome(sb.toString());
    }

    public boolean palindrome(String s) {
        int len = s.length();
        int left = 0;
        int right = len-1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left ++;
            right --;
        }
        return true;

    }

    public static class ListNode{
        ListNode next;

        int val;

        ListNode(int val){
            this.val = val;
        }
    }
}

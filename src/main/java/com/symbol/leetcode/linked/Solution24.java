package com.symbol.leetcode.linked;

/**
 * @Author GGuoLiang
 * @Date 2021/4/14 8:13 下午
 * @Version 1.0
 */
public class Solution24 {

    public ListNode swapPairs(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        ListNode next = head.next;
        head.next = swapPairs(head.next);
        next.next = head;
        return next;

    }
}

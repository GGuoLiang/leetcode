package com.symbol.leetcode.linked;

/**
 * @Author GGuoLiang
 * @Date 2021/4/14 7:27 下午
 * @Version 1.0
 */
public class Solution206 {

    public ListNode reverseList1(ListNode head) {
        ListNode prew = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode listNode = curr.next;
            curr.next = prew;
            prew = curr;
            curr = listNode;
        }
        return prew;
    }

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode curr = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return curr;
    }
}

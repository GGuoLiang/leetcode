package com.symbol.leetcode.linked;

/**
 * @Author GGuoLiang
 * @Date 2021/4/14 7:28 下午
 * @Version 1.0
 */
public class ListNode {

    public int val;
    public ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

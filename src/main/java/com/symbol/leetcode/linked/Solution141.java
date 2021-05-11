package com.symbol.leetcode.linked;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author GGuoLiang
 * @Date 2021/4/16 7:40 下午
 * @Version 1.0
 */
public class Solution141 {

    /**
     * 使用hash表
     * @param head
     * @return
     */
    public boolean hasCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>(16);
        ListNode listNode = head;
        while (listNode != null){
            if (set.add(listNode)){
                listNode = listNode.next;
            } else {
                return true;
            }
        }
        return false;
    }

    /**
     * 快慢指针
     * @param head
     * @return
     */
    public boolean hasCycle1(ListNode head) {
        if(head ==null){
            return false;
        }
        ListNode slow  = head;
        ListNode fast = head.next;
        while (fast != null && slow != null ){
            if(fast.next == null){
                return false;
            }
            if(fast == slow){
                return true;
            }
            slow = slow.next;
            fast =fast.next.next;
        }
        return false;
    }
}

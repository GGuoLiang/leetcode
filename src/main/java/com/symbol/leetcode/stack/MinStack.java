package com.symbol.leetcode.stack;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @Author GGuoLiang
 * @Date 2021/4/25 7:59 下午
 * @Version 1.0
 */
public class MinStack {

    Deque<Integer> xStack;
    Deque<Integer> minStack;

    public MinStack() {
        xStack = new LinkedList<Integer>();
        minStack = new LinkedList<Integer>();
        minStack.push(Integer.MAX_VALUE);
    }

    public void push(int x) {
        xStack.push(x);
        minStack.push(Math.min(minStack.peek(), x));
    }

    public void pop() {
        xStack.pop();
        minStack.pop();
    }

    public int top() {
        return xStack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }


    public static void main(String[] args) {

    }


}

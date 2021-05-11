package com.symbol.leetcode.stack;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * @Author GGuoLiang
 * @Date 2021/4/19 8:34 下午
 * @Version 1.0
 */
public class Solution20 {

    public static void main(String[] args) {
        String s = "()";
        System.out.println(isValid(s));
    }


    public static boolean isValid(String s) {
        int length = s.length();
        if(length <= 1){
            return false;
        }
        Map<Character, Character> pairs = new HashMap<Character, Character>() {{
            put(')', '(');
            put(']', '[');
            put('}', '{');
        }};
        Deque<Character> stack = new LinkedList<Character>();
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            if(pairs.containsKey(c)){
                if(!stack.isEmpty() && stack.peek().equals(pairs.get(c))){
                    stack.pop();
                }else{
                    return false;
                }
            }else{
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }


}

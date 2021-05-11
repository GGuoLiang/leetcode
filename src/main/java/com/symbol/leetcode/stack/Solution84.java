package com.symbol.leetcode.stack;

import java.util.Stack;

/**
 * @Author GGuoLiang
 * @Date 2021/4/26 8:01 下午
 * @Version 1.0
 */
public class Solution84 {

    public static void main(String[] args) {
        int[] heights = {6,7,5,2,4,5,9,3};
        Solution84 solution84 = new Solution84();
        System.out.println(solution84.largestRectangleArea3(heights));
    }


    public static int largestRectangleArea(int[] heights) {
        int length = heights.length;

        if(length ==  1){
            return 1*heights[0];
        }
        int max = 0;
        for (int i = 0; i < length; i++) {
            for (int i1 = i+1 ; i1 < length; i1++) {
                int min = Integer.MAX_VALUE;
                for (int i2 = i; i2 <= i1; i2++) {
                    min = Math.min(min,heights[i2]);
                }
                max = Math.max(max,min*(i1-i+1));
            }

        }
        return max;
    }


    public static int largestRectangleArea1(int[] heights) {
        if(heights.length < 1){
            return 0;
        }

        int length = heights.length;
        int max = 0;
        for (int i = 0; i < length; i++) {
            int left = i;
            int height = heights[i];
            while (left > 0 && heights[left - 1] >= height  ){
                left --;
            }
            int  right= i;
            while (right < length-1  && heights[right+1 ] >= height  ){
                right ++;
            }
            max = Math.max((right-left+1)*height,max);
        }
        return max;
    }


    public static int largestRectangleArea2(int[] heights) {
        if(heights.length < 1){
            return 0;
        }

        int length = heights.length;
        int max = 0;
        for (int i = 0; i < length; i++) {
            int left = i;
            int height = heights[i];
            while (left > 0 && heights[left - 1] >= height  ){
                left --;
            }
            max = Math.max((i-left+1)*height,max);
        }
        return max;
    }


    /**
     * 单调栈
     * @param heights
     * @return
     */
    public int largestRectangleArea3(int[] heights) {
        int n = heights.length;
        int[] left = new int[n];
        int[] right = new int[n];

        Stack<Integer> mono_stack = new Stack<Integer>();
        for (int i = 0; i < n; ++i) {
            while (!mono_stack.isEmpty() && heights[mono_stack.peek()] >= heights[i]) {
                mono_stack.pop();
            }
            left[i] = (mono_stack.isEmpty() ? -1 : mono_stack.peek());
            mono_stack.push(i);
        }

        mono_stack.clear();
        for (int i = n - 1; i >= 0; --i) {
            while (!mono_stack.isEmpty() && heights[mono_stack.peek()] >= heights[i]) {
                mono_stack.pop();
            }
            right[i] = (mono_stack.isEmpty() ? n : mono_stack.peek());
            mono_stack.push(i);
        }

        int ans = 0;
        for (int i = 0; i < n; ++i) {
            ans = Math.max(ans, (right[i] - left[i] - 1) * heights[i]);
        }
        return ans;
    }

}


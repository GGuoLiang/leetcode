package com.symbol.leetcode.array;

/**
 * @Author GGuoLiang
 * @Date 2021/4/8 10:59 上午
 * @Version 1.0
 * <p>
 * 呈最多水问题
 */
public class MaxArea {


    /**
     * （x-y）* Min
     *
     * @param height
     * @return
     */
    public int maxArea(int[] height) {
        int maxArea = 0;
        for (int i = 0; i < height.length; i++) {
            for (int i1 = i + 1; i1 < height.length; i1++) {
                maxArea = Math.max(maxArea, (i1 - i) * Math.min(height[i], height[i1]));
            }
        }
        return maxArea;
    }


    /**
     * 双指针的移动
     *
     * @param height
     * @return
     */
    public int maxArea1(int[] height) {
        int x = 0;
        int y = height.length - 1;
        int maxArea = 0;
        while (x < y) {
            int min = height[x] < height[y] ? height[x++] : height[y--];
            maxArea = Math.max(maxArea, (y - x + 1) * min);

        }
        return maxArea;

    }


    public static int maxArea11(int[] height) {

        int x = 0;
        int y = height.length - 1;
        int maxArea = 0;
        while (x < y) {
            int minHeight = height[x] < height[y] ? height[x++] : height[y--];
            maxArea = Math.max(maxArea, (y - x + 1) * minHeight);
        }
        return maxArea;

    }

}

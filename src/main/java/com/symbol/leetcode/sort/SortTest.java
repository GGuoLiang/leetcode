package com.symbol.leetcode.sort;

import java.util.Arrays;

/**
 * @author: Symbol
 * @Title: sortTest
 * @ProjectName: leetcode
 * @date: 2021/9/20 6:02 下午
 * @Description:
 */
public class SortTest {


    public static void main(String[] args) {
        int[] nums = {2, 1, 3, 4, 5, 6, 8, 9, 6, 54, 3, 2, 1};
        System.out.println(Arrays.toString(nums));
        InsertSort(nums);
        System.out.println(Arrays.toString(nums));

    }


    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    /**
     * 选择排序
     * 循环选择出来 最小的数  并放到前面的位置
     *
     * @param nums
     */
    public static void selectSort(int[] nums) {
        if (nums == null || nums.length < 2) {
            return;
        }

        int length = nums.length;
        for (int i = 0; i < length; i++) {
            int minIndex = i;
            for (int i1 = i + 1; i1 < length; i1++) {
                if (nums[minIndex] > nums[i1]) {
                    minIndex = i1;
                }
            }
            swap(nums, i, minIndex);
        }

    }


    /**
     * 冒泡排序
     * 俩俩比较 将大的值后移
     *
     * @param nums
     */
    public static void BubbleSort(int[] nums) {
        if (nums == null || nums.length < 2) {
            return;
        }

        int length = nums.length;
        for (int end = length; end > 0; end--) {
            for (int second = 1; second < end; second++) {
                if (nums[second] < nums[second - 1]) {
                    swap(nums, second, second - 1);
                }
            }
        }
    }

    /**
     * 插入排序
     * 0-1之间有序
     * 0-2
     * 0-3
     * 0-4
     * <p>
     * 0-n
     *
     * @param nums
     */
    public static void InsertSort(int[] nums) {
        if (nums == null || nums.length < 2) {
            return;
        }
        int length = nums.length;
        for (int i = 1; i < length; i++) {
            int num = i ;
            while (num-1  >= 0 && nums[num - 1] > nums[num]) {
                swap(nums, num-1, num );
                num--;
            }
        }
    }


}
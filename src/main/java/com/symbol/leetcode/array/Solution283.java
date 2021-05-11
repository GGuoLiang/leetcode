package com.symbol.leetcode.array;

import java.util.Arrays;

/**
 * @Author GGuoLiang
 * @Date 2021/4/6 8:23 下午
 * @Version 1.0
 */
public class Solution283 {


    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes3(nums);
        System.out.println(Arrays.toString(nums));
    }


    public static void moveZeroes1(int[] nums) {
        int cnt = 0;
        int zeroCnt = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[cnt++] = nums[i];
            } else {
                zeroCnt++;
            }
        }
        int num = nums.length - 1;
        for (int i = 0; i < zeroCnt; i++) {
            nums[num--] = 0;
        }
    }


    public static void moveZeroes2(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                if (i != j) {
                    nums[i] = 0;
                }
                j++;
            }

        }
    }

    public static void moveZeroes3(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index++] = nums[i];
            }
        }

        int num = nums.length - index;
        for (int i = 0; i < num; i++) {
            nums[index++] = 0;
        }

    }


}

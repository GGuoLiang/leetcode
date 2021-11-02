package com.symbol.leetcode.array;

import java.util.Arrays;

/**
 * @Author GGuoLiang
 * @Date 2021/4/6 8:23 下午
 * @Version 1.0
 * <p>
 * 零移动
 */
public class MoveZeroes {


    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes22(nums);
        System.out.println(Arrays.toString(nums));
    }


    /**
     * 第一遍遍历数组  用非零元素直接覆盖零元素 并且记录零元素个数
     * 第二变直接从最后向前遍历，根据根数直接修改为0值
     *
     * @param nums
     */
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


    /**
     * 引入下标j  标识的零元素的位置
     *
     * @param nums
     */
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

    /**
     * index 始终记录的非零的下标
     *
     * @param nums
     */
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


    public static void moveZeroes11(int[] nums) {
        if (nums.length < 1) {
            return;
        }

        int length = nums.length;
        int zeroCount = 0;
        int cnt = 0;
        for (int i = 0; i < length; i++) {
            if (nums[i] == 0) {
                zeroCount++;
            } else {
                nums[cnt] = nums[i];
                cnt++;
            }
        }

        for (int i = 0; i < zeroCount; i++) {
            nums[--length] = 0;
        }
    }

    public static void moveZeroes22(int[] nums) {
        if (nums.length < 1) {
            return;
        }
        int length = nums.length;
        int index = 0;
        for (int i = 0; i < length; i++) {
            if (nums[i] != 0) {
                nums[index] = nums[i];
                if (index != i) {
                    nums[i] = 0;
                }
                index++;
            }
        }
    }

}

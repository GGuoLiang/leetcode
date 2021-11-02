package com.symbol.leetcode.test;

/**
 * @author: Symbol
 * @Title: Test
 * @ProjectName: leetcode
 * @date: 2021/10/29 7:18 下午
 * @Description:
 */
public class Test {


    /**
     * 二分法
     */
    public int biSearch(int[] nums, int key) {

        if (key < nums[0] || key > nums[nums.length - 1]) {
            return -1;
        }

        int left = 0;
        int right = nums.length - 1;
        int mid = -1;
        while (left <= right) {
            mid = left + ((right - left) >> 1);
            if (nums[mid] < key) {
                left = mid + 1;
            } else if (nums[mid] > key) {
                right = mid - 1;
            } else {
                return mid;
            }
        }
        return mid;


    }


}
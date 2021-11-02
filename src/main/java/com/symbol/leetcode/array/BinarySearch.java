package com.symbol.leetcode.array;

/**
 * @author: Symbol
 * @Title: BinarySearch
 * @ProjectName: leetcode
 * @date: 2021/10/22 9:31 下午
 * @Description: 二分查找
 */
public class BinarySearch {

    public static void main(String[] args) {

        String s = "祝你考出好成绩！";
        System.out.println(s.length());

        int x = 1 , y = 2 , z = 3;
        System.out.println(y += z-- / ++x);
    }


    public static boolean search(int[] array, int key) {
        if (key < array[0] || key > array[array.length - 1]) {
            return false;
        }

        int left = 0;
        int right = array.length - 1;
        int mid = 0;

        /// 考虑题目的边界条件问题  左闭右闭  left <= right
        /// 左闭右开 left < right right = mid
        while (left <= right) {
            mid = left + (right - left) >> 1;
            if (array[mid] == key) {
                return true;
            } else if (array[mid] > key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }

        }

        return false;
    }

    public int search1(int[] nums, int target) {
        if (target < nums[0] || target > nums[nums.length - 1]) {
            return -1;
        }

        int left = 0;
        int right = nums.length - 1;
        int mid = 0;

        /// 考虑题目的边界条件问题  左闭右闭  left <= right
        /// 左闭右开 left < right right = mid
        while (left <= right) {
            mid = left + ((right - left) >> 1);
            if (nums[mid] == target)
                return mid;
            else if (nums[mid] < target)
                left = mid + 1;
            else if (nums[mid] > target)
                right = mid - 1;
        }

        return -1;
    }


    public int search2(int[] nums, int target) {
        ///
        if (nums == null || target < nums[0] || target >= nums[nums.length - 1]) {
            return -1;
        }
        int left = 0;
        int right = 0;
        int mid = 0;
        while (left <= right) {


        }
        return 0;
    }



}
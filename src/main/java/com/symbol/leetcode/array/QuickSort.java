package com.symbol.leetcode.array;

import java.util.Arrays;

/**
 * @author: Symbol
 * @Title: QuickSort
 * @ProjectName: leetcode
 * @date: 2021/10/29 7:45 下午
 * @Description:  快速排序
 */
public class QuickSort {


    public static void main(String[] args) {

        int[] nums = {2,1,3,4,5,7,5,8,9,10};
        quickSort(nums,0,nums.length-1);
        System.out.println(Arrays.toString(nums));

    }


    public static void quickSort(int[] nums, int start, int end){
        if(start >= end){
            return;
        }

        int left = start;
        int right  = end;

        int point = nums[(end+start)/2];

        while (left <= right ){
            while (left <= right && nums[left] < point)left++;
            while (left <= right && nums[right] > point)right--;
            if(left <= right){
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
            }
            quickSort(nums,start,right);
            quickSort(nums,left,end);
        }



    }


}
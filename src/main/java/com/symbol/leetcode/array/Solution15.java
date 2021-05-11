package com.symbol.leetcode.array;

import java.util.*;

/**
 * @Author GGuoLiang
 * @Date 2021/4/12 8:31 下午
 * @Version 1.0
 */
public class Solution15 {

    public static void main(String[] args) {
        int[] num = {-1, 0, 1, 2, -1, -4};
        int[] num1 = {0, 0, 0, 0};
        int[] num2 = {-1, 0, 1, 0};
        int[] num3 = {-1, 0, 1, 2, -1, -4, -2, -3, 3, 0, 4};
        System.out.println(threeSum1(num));
        System.out.println(threeSum2(num));
        System.out.println(threeSum1(num1));
        System.out.println(threeSum2(num1));
        System.out.println(threeSum1(num2));
        System.out.println(threeSum2(num2));
        System.out.println(threeSum1(num3));
        System.out.println(threeSum2(num3));
    }


    /**
     * 暴力解法
     *
     * @param nums
     * @return
     */
    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);
        Set<List<Integer>> lists = new HashSet<>(16);
        for (int i = 0; i < nums.length; i++) {
            for (int i1 = i + 1; i1 < nums.length; i1++) {
                for (int i2 = i1 + 1; i2 < nums.length; i2++) {
                    if (nums[i] + nums[i1] + nums[i2] == 0) {
                        List<Integer> list = new ArrayList<>(12);
                        list.add(nums[i]);
                        list.add(nums[i1]);
                        list.add(nums[i2]);
                        lists.add(list);
                    }
                }
            }
        }
        return new ArrayList<>(lists);
    }

    /**
     * 双指针移动
     *
     * @param nums
     * @return
     */
    public static List<List<Integer>> threeSum1(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>(16);
        Arrays.sort(nums);
        int a = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            a = i + 1;
            int b = nums.length - 1;
            while (a < b) {
                if (a > i + 1 && nums[a] == nums[a - 1]) {
                    a++;
                    continue;
                }
                if (nums[i] + nums[a] + nums[b] < 0) {
                    a++;
                    continue;
                } else if (nums[i] + nums[a] + nums[b] > 0) {
                    b--;
                    continue;
                }
                List<Integer> list = new ArrayList<>(12);
                list.add(nums[i]);
                list.add(nums[a]);
                list.add(nums[b]);
                lists.add(list);
                a++;
            }

        }

        return lists;
    }


    /**
     * 官方题解
     *
     * @param nums
     * @return
     */
    public static List<List<Integer>> threeSum2(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        // 枚举 a
        for (int first = 0; first < n; ++first) {
            // 需要和上一次枚举的数不相同
            if (first > 0 && nums[first] == nums[first - 1]) {
                continue;
            }
            // c 对应的指针初始指向数组的最右端
            int third = n - 1;
            int target = -nums[first];
            // 枚举 b
            for (int second = first + 1; second < n; ++second) {
                // 需要和上一次枚举的数不相同
                if (second > first + 1 && nums[second] == nums[second - 1]) {
                    continue;
                }
                // 需要保证 b 的指针在 c 的指针的左侧
                while (second < third && nums[second] + nums[third] > target) {
                    --third;
                }
                // 如果指针重合，随着 b 后续的增加
                // 就不会有满足 a+b+c=0 并且 b<c 的 c 了，可以退出循环
                if (second == third) {
                    break;
                }
                if (nums[second] + nums[third] == target) {
                    List<Integer> list = new ArrayList<Integer>();
                    list.add(nums[first]);
                    list.add(nums[second]);
                    list.add(nums[third]);
                    ans.add(list);
                }
            }
        }
        return ans;
    }


    public static List<List<Integer>> threeSum3(int[] nums) {
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            int b = length - 1;
            for (int i1 = i + 1; i1 < length; i1++) {

                if (nums[i] + nums[i1] + nums[b] == 0) {
                    List<Integer> list = new ArrayList<Integer>();
                    list.add(nums[i]);
                    list.add(nums[i1]);
                    list.add(nums[b]);
                    //.add(list);
                }
            }

        }
        return null;
    }


}

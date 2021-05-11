package com.symbol.leetcode.array;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author GGuoLiang
 * @Date 2021/4/12 8:08 下午
 * @Version 1.0
 * <p>
 * 俩数之和
 */
public class Solution1 {


    /**
     * 暴力解法
     *
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int i1 = i + 1; i1 < nums.length; i1++) {
                if (nums[i] + nums[i1] == target) {
                    int[] targetNums = {i, i1};
                    return targetNums;
                }
            }
        }
        return new int[]{};

    }


    /**
     * hash 解法
     *
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum1(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>(16);
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }


}

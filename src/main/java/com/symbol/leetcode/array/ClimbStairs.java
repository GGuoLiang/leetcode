package com.symbol.leetcode.array;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author GGuoLiang
 * @Date 2021/4/8 10:59 上午
 * @Version 1.0
 *
 * 爬楼梯
 */
public class ClimbStairs {

    private static final Map<Integer, Integer> dp = new HashMap();

    public static void main(String[] args) {
        //  System.out.println(climbStairs(6));
        System.out.println(climbStairs1(6));
        System.out.println(climbStairs2(6));
        System.out.println(climbStairs3(6));
    }


    public static int climbStairs3(int n) {
        if (n < 0)
            return 0;
        if (n == 0)
            return 1;
        if (dp.containsKey(n))
            return dp.get(n);
        int steps = climbStairs(n - 1) + climbStairs(n - 2);
        dp.put(n, steps);
        return steps;
    }


    public static int climbStairs(int n) {
        if (n < 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        if (dp.containsKey(n)) {
            return n;
        }
        int step = climbStairs(n - 1) + climbStairs(n - 2);
        dp.put(n, step);
        return step;
    }

    public static int climbStairs1(int n) {
        int p = 0;
        int q = 0;
        int r = 1;
        for (int i = 1; i <= n; i++) {
            p = q;
            q = r;
            r = p + q;
        }
        return r;
    }

    public static int climbStairs2(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        int p = 0;
        int q = 1;
        int r = 2;
        for (int i = 3; i <= n; i++) {
            p = q;
            q = r;
            r = p + q;
        }
        return r;

    }


    public static int climbStairs31(int n){
        int[] nums = new int[n+1];
        nums[0] = 1;
        nums[1] = 1;

        for (int i = 2; i < nums.length; i++) {
            nums[i] = nums[i-1]+nums[i-2];
        }
        int num = nums[nums.length - 1];
        return num;
    }


}

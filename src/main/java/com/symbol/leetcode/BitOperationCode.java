package com.symbol.leetcode;

/**
 * @author: Symbol
 * @Title: BitOperationCode
 * @ProjectName: leetcode
 * @date: 2021/9/20 6:03 下午
 * @Description:
 */
public class BitOperationCode {


    public static void main(String[] args) {
      /*  print(1);
        print(Integer.MAX_VALUE);
        print(Integer.MIN_VALUE);*/

        /// 取负数  取反 + 1
       /* int a = 4;
        System.out.println(a);
        int b = ~a +1;
        System.out.println(b);*/

        int  a= -15;
        print(a);
        // 符号为移动
        print(a >> 1);
        // 无符号位移动
        print(a >>> 1);





    }


    public static void print(int num) {

        for (int i = 32; i > 0; i--) {
            System.out.print((num & 1 << i - 1) == 0 ? 0 : 1);
        }
        System.out.println();

    }
}
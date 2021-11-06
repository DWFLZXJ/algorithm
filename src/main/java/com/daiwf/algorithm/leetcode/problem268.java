package com.daiwf.algorithm.leetcode;

/**
 * @description:
 * @author: daiwf
 * @time: 2021-11-06
 */
public class problem268 {
    /**
     * 自己想的办法，总觉得不够优雅 daiwf
     */
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int[] tmp = new int[n + 1];
        for (int num : nums) {
            if (num != 0) {
                tmp[num] = num;
            } else {
                tmp[num] = 10001;
            }

        }
        for (int i = 0; i < n + 1; i++) {
            if (tmp[i] == 0) {
                return i;
            }
        }
        return 0;
    }


    /**
     * 数学方式
     * 这个方式算出来正常情况下的和减去现在的和就是那个没有的。
     */

    public int missingNumber1(int[] nums) {
        int n = nums.length;
        int total = ((1 + n) * n) / 2;
        int tmp = 0;
        for (int num : nums) {
            tmp = tmp + num;
        }
        return total - tmp;
    }
}

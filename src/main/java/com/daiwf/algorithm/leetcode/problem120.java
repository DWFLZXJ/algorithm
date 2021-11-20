package com.daiwf.algorithm.leetcode;

import java.util.List;

/**
 * @description:三角形最小路径和
 * @author: daiwf
 * @time: 2021-11-19
 */
public class problem120 {

    //https://www.bilibili.com/video/BV1sp4y1S7Rs 借助b站老哥的思路解出来的。比较好理解 递归的反而理解不了。daiwf
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[][] dp = new int[n][n];
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                //主要是找到递推公式
                dp[i][j] = Math.min(dp[i + 1][j], dp[i + 1][j + 1]) + triangle.get(i).get(j);
            }
        }
        return dp[0][0];

    }
}

package com.daiwf.algorithm.leetcode;

import java.util.Arrays;

/**
 * @version [版本号，2021/10/2 0002]
 * @文件名 problem122Mid
 * @作者 daiwf
 * @创建时间 2021/10/2 0002 21:08
 * @描述 [中等难度，买卖股票的最佳时机 II]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class problem122Mid {



    /**
     * @作者 daiwf
     * @创建时间 2021/10/2 0002 21:56
     * @版权 Copyright Epoint Tech. Co. Ltd. All Rights Reserved.
     * @功能描述 [这是第一次自己想到一个中级难度的题目的解还可以]
     * * @param null
     * @return:
     */
    public int maxProfit(int[] prices) {
        int in = 0;
        int out = 0;

        if (prices.length == 0 || prices == null) {
            return 0;
        }

        for (int i = 0; i < prices.length; i++) {
            if (i + 1 < prices.length) {
                if (prices[i] < prices[i + 1]) {
                    in = prices[i];
                    for (int j = i + 1; j < prices.length; j++) {
                        if (j + 1 == prices.length) {
                            out = prices[j];
                            return out - in + maxProfit(Arrays.copyOfRange(prices, j + 1, prices.length));
                        }
                        if (j + 1 < prices.length) {
                            if (prices[j] > prices[j + 1]) {
                                out = prices[j];
                                return (out - in) + maxProfit(Arrays.copyOfRange(prices, j + 1, prices.length));
                            }
                        }

                    }
                }
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        int[] prices = new int[]{7, 1, 5, 3, 6, 4};
        int max = new problem122Mid().maxProfit(prices);
        System.out.println(max);
    }


}

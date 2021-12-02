package com.daiwf.algorithm.leetcode;

import java.util.Arrays;

/**
 * @description:
 * @author: daiwf
 * @time: 2021-12-02
 */
public class problem506 {
    public String[] findRekativeRanks(int[] score) {
        int n = score.length;
        String[] result = new String[n];
        String[] des = new String[]{"Gold Medal", "Silver Medal", "Bronze Medal"};
        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            arr[i][0] = score[i];
            arr[i][1] = i;
        }
        Arrays.sort(arr, (a, b) -> (b[0] - a[0]));
        for (int i = 0; i < n; i++) {
            if (i >= 3) {
                result[arr[i][1]] =String.valueOf(i+1);
            } else {
                result[arr[i][1]] = des[i];
            }

        }

        return result;


    }
}

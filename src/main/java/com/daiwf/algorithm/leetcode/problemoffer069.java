package com.daiwf.algorithm.leetcode;

/**
 * @version [版本号，2021-10-14]
 * @文件名 problemoffer069
 * @作者 daiwf
 * @创建时间 2021-10-14 8:47
 * @描述 [剑指offer069]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class problemoffer069 {
    public int peakIndexInMountainArray(int[] arr) {
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            if (arr[i] > arr[i + 1]) {
                return i;
            }
        }
        return 0;
    }
}

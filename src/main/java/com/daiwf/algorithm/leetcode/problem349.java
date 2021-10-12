package com.daiwf.algorithm.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;

/**
 * @version [版本号，2021-10-11]
 * @文件名 problem349
 * @作者 daiwf
 * @创建时间 2021-10-11 22:02
 * @描述 [两个数组的交集]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class problem349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new TreeSet<>();
        Set<Integer> set1 = new TreeSet<>();
        int length;
        if (nums1.length > nums2.length) {
            length = nums2.length;
        } else {
            length = nums1.length;
        }
        int[] tmp = new int[length];
        for (int num : nums1) {
            set.add(num);
        }
        for (int num : nums2) {
            if (set.contains(num)) {
                set1.add(num);
            }
        }
        int i = 0;
        for (int num : set1) {
            tmp[i++] = num;
        }
        return Arrays.copyOfRange(tmp, 0, i);
    }
}

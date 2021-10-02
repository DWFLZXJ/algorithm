package com.daiwf.algorithm.leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @version [版本号，2021/10/2 0002]
 * @文件名 Intersect
 * @作者 daiwf
 * @创建时间 2021/10/2 0002 8:27
 * @版权 Copyright Epoint Tech. Co. Ltd. All Rights Reserved.
 * @描述 [ 参考题解：https://leetcode-cn.com/problems/intersection-of-two-arrays-ii/solution/liang-ge-shu-zu-de-jiao-ji-ii-by-leetcode-solution/]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class problem350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return intersect(nums2, nums1);
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums1) {
            int count = map.getOrDefault(num, 0);
            map.put(num, ++count);
        }
        int[] sections = new int[nums1.length];
        int index = 0;
        for (int num : nums2) {
            int count = map.getOrDefault(num, 0);
            if (count > 0) {
                sections[index++] = num;
                map.put(num, --count);
            } else {
                //省的下次循环到他，降低了效率
                map.remove(num);
            }
        }
        return Arrays.copyOfRange(sections, 0, index);
    }

}

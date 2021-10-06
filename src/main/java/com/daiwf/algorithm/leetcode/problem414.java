package com.daiwf.algorithm.leetcode;

import java.util.*;

/**
 * @version [版本号，2021/10/6 0006]
 * @文件名 problem414
 * @作者 daiwf
 * @创建时间 2021/10/6 0006 20:55
 * @描述 [第三大的数]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class problem414 {
    /**
     * @作者 daiwf
     * @创建时间 2021/10/6 0006 20:55
     * @功能描述 [这是自己想到的]
     * * @param null
     * @return:
     */
    public int thirdMax(int[] nums) {
        Set<Integer> set = new HashSet();
        for (int num : nums) {
            set.add(num);
        }
        int[] tmp = new int[set.size()];
        int i = 0;
        for (int num : set) {
            tmp[i++] = num;
        }
        Arrays.sort(tmp);
        if (tmp.length < 3) {
            return tmp[tmp.length - 1];
        }

        return tmp[tmp.length - 3];
    }


    /**
     * @作者 daiwf
     * @创建时间 2021/10/6 0006 21:20
     * @功能描述 [这是官方的]
     * * @param null
     * @return:
     */
    public int thirdMax1(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int num : nums) {
            set.add(num);
            if (set.size() > 3) {
                set.remove(set.first());
            }
        }
        return set.size() < 3 ? set.last() : set.first();
    }
}

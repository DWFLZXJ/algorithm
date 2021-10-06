package com.daiwf.algorithm.leetcode;

import java.util.HashMap;

/**
 * @version [版本号，2021/10/6 0006]
 * @文件名 problem1
 * @作者 daiwf
 * @创建时间 2021/10/6 0006 20:40
 * @描述 [两数之和]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class problem1 {


    /**
     * @作者 daiwf
     * @创建时间 2021/10/6 0006 20:49
     * @功能描述 [利用hash表降低复杂度]
     * * @param null
     * @return:
     */
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};

    }
}

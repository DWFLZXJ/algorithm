package com.daiwf.algorithm.leetcode;

/**
 * @version [版本号，2021-10-10]
 * @文件名 problem441
 * @作者 daiwf
 * @创建时间 2021-10-10 14:45
 * @描述 [排列硬币]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class problem441 {

    /**
     * @作者 daiwf
     * @创建时间 2021-10-10 14:57
     * @功能描述 [用的二分法]
     * * @param null
     * @return:
     */
    public int arrangeCoins(int n) {
        int left = 1, right = n;
        while (left < right) {
            int mid = (right - left + 1) / 2 + left;
            if ((long) mid * (mid + 1) <= (long) 2 * n) {
                left = mid;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }

}

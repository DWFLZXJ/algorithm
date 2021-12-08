package com.daiwf.algorithm.leetcode;


/**
 * @description:跳跃游戏
 * @author: daiwf
 * @time: 2021-12-08
 */
public class problem55 {

    //大佬版本
    public boolean canJump(int[] nums) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > k) {
                return false;
            }
            k = Math.max(k, i + nums[i]);
        }
        return true;
    }
    //优化的官方版 好处就是不用真的跳到最后就能知道是否能到达
    public boolean canJumppro(int[] nums) {
        int n = nums.length;
        int rightmost = 0;
        for (int i = 0; i < n; ++i) {
            if (i <= rightmost) {
                rightmost = Math.max(rightmost, i + nums[i]);
                if (rightmost >= n - 1) {
                    return true;
                }
            }
        }
        return false;
    }


}

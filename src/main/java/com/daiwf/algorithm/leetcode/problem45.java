package com.daiwf.algorithm.leetcode;

import java.util.Map;
import java.util.regex.Matcher;

/**
 * @description:
 * @author: daiwf
 * @time: 2021-12-08
 */
public class problem45 {


    public int jump(int[] nums) {
        int length = nums.length;
        int end = 0;
        int maxPosition = 0;
        int steps = 0;
        for (int i = 0; i < length - 1; i++) {
            maxPosition = Math.max(maxPosition, i + nums[i]);
            if (i == end) {
                end = maxPosition;
                steps++;
            }
        }
        return steps;
    }


    public int jump2(int[] nums) {
       int end=0;
       int maxPosition=0;
       int steps=0;
       for (int i=0;i<nums.length;i++){
           maxPosition= Math.max(maxPosition,i+nums[i]);
           if(i==end&&i<nums.length-1){//最后一次就不要跳了
               end=maxPosition;
               steps++;
           }
       }
       return steps;
    }


}

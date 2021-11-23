package com.daiwf.algorithm.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @description:
 * @author: daiwf
 * @time: 2021-11-22
 */
public class problem384 {

    int[] original;
    int[] nums;

    public problem384(int[] nums) {
        this.nums=nums;
        original = new int[nums.length];
        System.arraycopy(nums,0,original,0,nums.length);
    }

    public int[] reset() {
        System.arraycopy(original,0,nums,0,original.length);
        return nums;
    }

    public int[] shuffle() {
        int[] shuffle= new int[nums.length];
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        int length =nums.length;
        for (int i=0;i<length;i++){
            list.add(nums[i]);
        }
        for (int i=0;i<nums.length;i++){
         
            shuffle[i]=  list.remove(random.nextInt(list.size()));
        }
        return shuffle;

    }
}

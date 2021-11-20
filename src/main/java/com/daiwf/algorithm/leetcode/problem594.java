package com.daiwf.algorithm.leetcode;

import java.util.HashMap;

/**
 * @description:
 * @author: daiwf
 * @time: 2021-11-20
 */
public class problem594 {


    public int findLHS(int[] nums) {
        HashMap<Integer, Integer> cnt = new HashMap<>();
        int ans=0;

        for (int num:nums){
            cnt.put(num,cnt.getOrDefault(num,0)+1);
        }
        for (int key :cnt.keySet()){
            if(cnt.containsKey(key+1)){
              ans=Math.max(ans,cnt.get(key)+cnt.get(key+1));
            }
        }
        return ans;

    }


}

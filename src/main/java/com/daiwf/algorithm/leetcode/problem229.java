package com.daiwf.algorithm.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @description:
 * @author: daiwf
 * @time: 2021-10-22
 */
public class problem229 {
    
    /**
     * @作者 daiwf
     * @创建时间 2021-10-22 22:31
     * @功能描述 [先用简单的hash法练练手感吧]
     * * @param null
     * @return:
     */
    public List<Integer> majorityElement(int[] nums) {

        List<Integer> list=new ArrayList<>();
        HashMap<Integer, Integer> map =new HashMap();
        int n =nums.length;
        int[] result = new int[n];
        for (int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }


        for(int key:map.keySet()){
            if(map.get(key)>(n/3)){
                list.add(key);
            }
        }
       return list;

    }

    /**
     * @作者 daiwf
     * @创建时间 2021-10-22 22:37
     * @功能描述 [第二种解法是摩尔投票法比较妙]
     * * @param null
     * @return:
     */
    public List<Integer> majorityElement1(int[] nums) {



    }
}

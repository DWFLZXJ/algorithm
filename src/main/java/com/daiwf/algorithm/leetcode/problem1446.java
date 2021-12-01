package com.daiwf.algorithm.leetcode;

import java.util.Map;

/**
 * @description:
 * @author: daiwf
 * @time: 2021-12-01
 */
public class problem1446 {
    //重拳出击，秒了
    public int maxPower(String s) {
      int max =1;
      int len = s.length();
      for (int i=0;i<len;i++){
           if(i>0&&s.charAt(i)==s.charAt(i-1)){
               int j=i;
               int count=1;
               while (j<len&&s.charAt(j)==s.charAt(j-1)){
                   j++;
                   count++;
               }
               Math.max(max,count);
           }
      }
     return max;

    }
}

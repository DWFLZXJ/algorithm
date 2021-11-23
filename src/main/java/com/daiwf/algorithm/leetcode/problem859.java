package com.daiwf.algorithm.leetcode;

import java.util.Stack;

/**
 * @description:
 * @author: daiwf
 * @time: 2021-11-23
 */
public class problem859 {
    public boolean buddyStrings(String s, String goal) {
        if (s.isEmpty() || goal.isEmpty()) {
            return false;
        }
        if (s.length() != goal.length()) {
            return false;
        }
        //如果字符串相等的
        if (s.equals(goal)) {
            //核心难点其实都在这边
            int[] count = new int[26];
            for (int i = 0; i < s.length(); i++) {
                count[s.charAt(i) - 'a']++;
                if (count[s.charAt(i) - 'a'] > 1) {
                    return true;
                }
            }
            return false;

        }

        int[] tmp = new int[2];
        int count = 0;
        for (int i = 0; i < goal.length(); i++) {
            if (s.charAt(i) != goal.charAt(i)) {
                if(count>1){
                    return false;
                }
                tmp[count++] = i;
            }
        }

        return s.charAt(tmp[0]) == goal.charAt(tmp[1]) && s.charAt(tmp[1]) == goal.charAt(tmp[0]);

    }




}

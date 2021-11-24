package com.daiwf.algorithm.leetcode;

import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: daiwf
 * @time: 2021-11-23
 */
public class problem93 {

    List<String> result = new ArrayList<>();
    private static final int SEGMENT = 4;
    int[] segments = new int[SEGMENT];


    public List<String> restoreIpAddresses(String s) {

        dfs(s, 0, 0);
        return result;

    }

    public void dfs(String s, int segid, int startindex) {

        if (segid == SEGMENT && startindex == s.length()) {
            result.add(calcIp(segments));
            return;
        }
        if (startindex == s.length()) {
            return;
        }
        if (segid == 4) {
            return;
        }
        if (s.charAt(startindex) == '0') {
            segments[segid] = 0;
            dfs(s, segid + 1, startindex + 1);
        }

        int start = 0;
        for (int endindex = startindex; endindex < s.length(); endindex++) {
            start = start * 10 + (s.charAt(endindex) - '0');
            if (start > 0 && start <= 0xff) {
                segments[segid] = start;
                dfs(s, segid + 1, endindex + 1);
            } else {
                break;
            }
        }


    }

    public String calcIp(int[] segments) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            sb.append(segments[i]);
            if (i != 3) {
                sb.append(".");
            }

        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s="25525511135";
        new problem93().restoreIpAddresses(s);
    }


}

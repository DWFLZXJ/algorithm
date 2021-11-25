package com.daiwf.algorithm.leetcode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * @description: 分割回文串
 * @author: daiwf
 * @time: 2021-11-25
 */
public class problem131dppr {

    public List<List<String>> partition(String s) {
        //存答案
        List<List<String>> ans = new ArrayList<>();
        //存每次的路径
        Deque<String> path = new ArrayDeque<>();

        int len =s.length();
        if (len == 0) {
            return ans;
        }

        //通过动态规划的转移方程先把所有情况的回文状态存了
        boolean[][] dp=new boolean[len][len];
       char[] chars= s.toCharArray();
        for (int right=0;right<len;right++){
            for (int left=0;left<=right;left++){
                if(chars[left]==chars[right]&&(right-left<=2||dp[left+1][right-1])){
                    dp[left][right]=true;
                }
            }
        }

        dfs(s,0,len,path,ans,dp);
        return ans;

    }

    public void dfs(String s,int index,int len, Deque<String> path, List<List<String>> ans,boolean[][] dp){

        if(index==len){
            ans.add(new ArrayList<>(path));
            return;
        }

        for(int i=0;i<len;i++){
            if(dp[index][i]){
                path.addLast(s.substring(index,i+1));
                dfs(s,i+1,len,path,ans,dp);
                path.removeLast();
            }
        }

    }
}

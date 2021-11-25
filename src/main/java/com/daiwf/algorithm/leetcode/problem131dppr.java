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

        /**
         * 找到递归的返回条件。就是index了。塞入答案。
         * 递归完之后就会一层层的返回，每次返回就从栈里面弹出一次答案
         * 答案弹完了就赶紧了。然后再从下个index继续递归下去。
         * 至于剪枝就是去掉一些不符合的情况。continue掉。
         */
        if(index==len){
            ans.add(new ArrayList<>(path));
            return;
        }
        /**
         * 回溯的核心逻辑，从index为0开始，找右边界符合条件的，塞入栈。然后从下个index再递归。
         *
         */
        for(int i=0;i<len;i++){
            if(dp[index][i]){
                path.addLast(s.substring(index,i+1));
                dfs(s,i+1,len,path,ans,dp);
                path.removeLast();
            }
        }

    }
}

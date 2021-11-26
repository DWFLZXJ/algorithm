package com.daiwf.algorithm.leetcode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * @description:
 * @author: daiwf
 * @time: 2021-11-26
 */
public class problem77 {
    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> combine(int n, int k) {

        if (n <= 0 || k > n) {
            return ans;
        }
       List<Integer> path = new ArrayList<>();
        dfs(n, k, 1, path);
        return ans;
    }

    public void dfs(int n, int k, int start, List<Integer> path) {
        if(path.size()==k){
            //这里很重要一定要new 原来的对象是局部的变量，出了这个方法就没了
            ans.add(new ArrayList<>(path));
            return;
        }
        for (int i=start;i<n+1;i++){
            path.add(i);
            dfs(n,k,i+1,path);
            path.remove(path.size()-1);
        }

    }

    public static void main(String[] args) {
        new problem77().combine(4,2);
    }

}

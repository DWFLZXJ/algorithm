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
public class problem46 {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        int len =nums.length;

       Deque<Integer> path = new ArrayDeque<>();

        if(nums.length==0){
            return  ans;
        }
        boolean[] used =new boolean[len];
        dfs(nums,used,0,len,path);
        return ans;
    }

    public void dfs(int[] nums,boolean[] used,int index,int len,Deque<Integer> path){

        if(index==len){
            ans.add(new ArrayList<>(path));
            return;
        }
        for (int i=0;i<len;i++){
            if(!used[i]){
                path.addFirst(nums[i]);
                used[i]=true;
                dfs(nums,used,index+1,len,path);
                path.removeFirst();
                used[i]=false;
            }

        }
    }

}

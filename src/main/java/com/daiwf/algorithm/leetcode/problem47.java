package com.daiwf.algorithm.leetcode;

import java.util.*;

/**
 * @description:全排列
 * @author: daiwf
 * @time: 2021-11-26
 */
public class problem47 {
    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> permuteUnique(int[] nums) {

        Deque<Integer> path = new ArrayDeque<>();
        if (nums.length == 0) {
            return ans;
        }
        Arrays.sort(nums);
        boolean[] visited = new boolean[nums.length];

        dfs(nums, 0, path, visited);
        return ans;
    }

    public void dfs(int[] nums, int index, Deque<Integer> path, boolean[] visited) {


        if (index == nums.length) {
            ans.add(new ArrayList<>(path));
            return;
        }

        for (int i = 0; i < nums.length; i++) {

            /**
             * 加上 !vis[i - 1]来去重主要是通过限制一下两个相邻的重复数字的访问顺序
             *
             * 举个栗子，对于两个相同的数11，我们将其命名为1a1b, 1a表示第一个1，1b表示第二个1； 那么，不做去重的话，会有两种重复排列 1a1b, 1b1a， 我们只需要取其中任意一种排列； 为了达到这个目的，限制一下1a, 1b访问顺序即可。 比如我们只取1a1b那个排列的话，只有当visit nums[i-1]之后我们才去visit nums[i]， 也就是如果!visited[i-1]的话则continue
             */
            if (visited[i] || (i > 0 && nums[i] == nums[i - 1] && !visited[i - 1])) {
                continue;
            }
                path.addFirst(nums[i]);
                visited[i] = true;
                dfs(nums, index + 1, path, visited);
                path.removeFirst();
                visited[i] = false;

        }

    }
}

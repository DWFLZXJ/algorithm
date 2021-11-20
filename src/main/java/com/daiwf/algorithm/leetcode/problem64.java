package com.daiwf.algorithm.leetcode;

/**
 * @description:最小路径和
 * @author: daiwf
 * @time: 2021-11-20
 */
public class problem64 {


    //https://leetcode-cn.com/problems/minimum-path-sum/solution/zui-xiao-lu-jing-he-dong-tai-gui-hua-gui-fan-liu-c/
    public int minPathSum(int[][] grid) {


        int x = grid.length;
        int y = grid[0].length;

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (i == 0 && j == 0) {
                    grid[0][0] = grid[0][0];
                } else if (i == 0 && j != 0) {
                    grid[i][j] = grid[i][j - 1] + grid[i][j];
                } else if (i != 0 && j == 0) {
                    grid[i][j] = grid[i - 1][j] + grid[i][j];
                } else {
                    grid[i][j] = Math.min(grid[i - 1][j], grid[i][j - 1]) + grid[i][j];
                }
            }
        }
        return grid[x - 1][y - 1];

    }

}

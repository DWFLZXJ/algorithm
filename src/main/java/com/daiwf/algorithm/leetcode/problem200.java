package com.daiwf.algorithm.leetcode;

class problem200 {
    //四个遍历方向
    private int[][] direct = {{0, 1}, {0, -1}, {-1, 0}, {1, 0}};
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }


        int count = 0;
        boolean[][] visited = new boolean[grid.length][grid[0].length];

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (visited[i][j]) {
                    continue;
                }
                if (grid[i][j] == '1') {

                    count++;
                }

                floodfill(grid, i, j, visited);
            }
        }


        return count;

    }
    public void floodfill(char[][] grid, int row, int col, boolean[][] visited) {

        if (row<0||row>= grid.length||col<0||col>=grid[0].length||visited[row][col] || grid[row][col] == '0') {
            return;
        }
        visited[row][col] = true;
        for (int i = 0; i < 4; i++) {
            int x = row + direct[i][0];
            int y = col + direct[i][1];


            floodfill(grid, x, y, visited);
        }

    }
}
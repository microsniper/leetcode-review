package com.sniper.leetcodereview.solution.leetcode.topic_200;

/**
 * sniper
 * 2025/4/4 下午6:03
 */
public class Solution {
    public int numIslands(char[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int res = 0;
        for(int i=0; i<row; i++){
            for(int j = 0; j<col; j++){
                if (grid[i][j] == '1'){
                    res += 1;
                    dfsBack(grid,i,j,row,col);
                }
            }
        }
        return res;
    }
    private static void dfsBack(char[][] grid, int i, int j, int row, int col) {
        if (i <0 || j< 0 || i >= row || j>= col ||grid[i][j] == '0'){
            return;
        }
        grid[i][j] = '0';
        dfsBack(grid,i+1,j,row,col);
        dfsBack(grid,i-1,j,row,col);
        dfsBack(grid,i,j+1,row,col);
        dfsBack(grid,i,j-1,row,col);

    }
}

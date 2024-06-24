package com.sniper.leetcodereview.solution.algorithm.dfs.topic_200;

/**
 * @Description
 * @Author sniper
 * @Date 2024/6/23 11:59 AM
 **/
public class Solution {
    public static int numIslands(char[][] grid) {
        if (grid == null && grid.length == 0){
            return 0;
        }
        int result = 0;
        int row = grid.length;
        int column = grid[0].length;
        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                if (grid[i][j] == '1'){
                    result += 1;
                    dfsBack(grid,i,j,row,column);
                }
            }
        }
        return result;
    }

    private static void dfsBack(char[][] grid, int i, int j, int row, int column) {
        if (i < 0 || j < 0 || i >= row || j >= column ||
                grid[i][j] == '0'){
            return;
        }
        grid[i][j] = '0';
        dfsBack(grid,i+1,j,row,column);
        dfsBack(grid,i-1,j,row,column);
        dfsBack(grid,i,j+1,row,column);
        dfsBack(grid,i,j-1,row,column);

    }
}

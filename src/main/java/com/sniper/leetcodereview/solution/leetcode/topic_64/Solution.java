package com.sniper.leetcodereview.solution.leetcode.topic_64;

/**
 * @Description
 * @Author sniper
 * @Date 2024/7/24 11:25 AM
 **/
public class Solution {

    public static int minPathSum(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int[][] dp = new int[row][col];


        int sum = 0;
        for (int i = 0; i < col; i++) {
            sum += grid[0][i];
            dp[0][i] = sum;
        }
        int sum2 = 0;
        for (int i = 0; i < row; i++) {
            sum2 += grid[i][0];
            dp[i][0] = sum2;
        }

        for (int i = 1; i < row; i++) {
            for (int j = 1; j < col; j++) {
                dp[i][j] = Math.min(grid[i][j] + dp[i-1][j],grid[i][j] + dp[i][j-1]);
            }
        }
        return dp[row-1][col-1];
    }
}

package com.sniper.leetcodereview.solution.leetcode.topic_74;

/**
 * sniper
 * 2025/3/30 下午2:23
 */
public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;

        int left = 0;
        int right = row * col -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int x = mid / col;
            int y = mid % col;
            if (matrix[x][y] == target) {
                return true;
            } else if (matrix[x][y] < target) {
                left = x * col + y +1;
            } else {
                right = x * col + y -1;
            }
        }
        return false;
    }
}

package com.sniper.leetcodereview.solution.leetcode100.topic_48;

/**
 * sniper
 * 2025/3/23 下午6:39
 */
public class Solution {
    public void rotate(int[][] matrix) {
        int len = matrix.length;

        for (int i=0; i<len;i++) {
            for (int j=i; j<len; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for (int i=0; i<len; i++) {
            for (int j=0; j<len/2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][len-j-1];
                matrix[i][len-j-1] = temp;
            }
        }

    }
}

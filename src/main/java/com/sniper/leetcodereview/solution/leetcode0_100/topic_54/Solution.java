package com.sniper.leetcodereview.solution.leetcode0_100.topic_54;

import java.util.ArrayList;
import java.util.List;

/**
 * sniper
 * 2025/3/30 下午1:47
 */
public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int top = 0;
        int left = 0;
        int right = matrix[0].length-1;
        int bottom = matrix.length-1;

        List<Integer> list = new ArrayList<>();
        while (top <= bottom && left <= right) {

            for (int i=left; i<= right; i ++) {
                list.add(matrix[top][i]);
            }
            top++;

            for (int i=top; i<= bottom; i++) {
                list.add(matrix[i][right]);
            }
            right--;

            if (top <= bottom) {
                for (int i=right; i>=left; i--) {
                    list.add(matrix[bottom][i]);
                }
                bottom--;
            }

            if (left <= right) {
                for (int i=bottom; i>= top; i--) {
                    list.add(matrix[i][left]);
                }
                left++;
            }
        }
        return list;



    }
}

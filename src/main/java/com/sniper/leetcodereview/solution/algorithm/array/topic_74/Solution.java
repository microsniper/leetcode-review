package com.sniper.leetcodereview.solution.algorithm.array.topic_74;

/**
 * @Description
 * @Author sniper
 * @Date 2024/6/6 10:35 AM
 **/
public class Solution {
    /*  (x,y)
        二维数组转一维索引公式：(x,y) -> x * column + y
        一维索引转二维坐标公式：index ->  x = index / column   y = index % column
     */
    public static boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        if (row == 0){
            return false;
        }
        int column = matrix[0].length;
        if (column == 0){
            return false;
        }

        int left = 0;
        int right = row * column - 1 ;
        while (left <= right){
            int mid = left + (right - left) / 2;
            int x = mid / column ;
            int y = mid % column;
            if (matrix[x][y] == target){
                return true;
            }else if (matrix[x][y] < target){
                left = x * column + y + 1;
            }else{
                right = x * column + y -1;
            }
        }
        return false;
    }
}

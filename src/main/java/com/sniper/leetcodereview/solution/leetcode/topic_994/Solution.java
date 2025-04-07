package com.sniper.leetcodereview.solution.leetcode.topic_994;

import java.util.LinkedList;
import java.util.Queue;

/**
 * sniper
 * 2025/4/4 下午10:25
 */
public class Solution {
    public int orangesRotting(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;

        int[][] dirs = {{-1,0}, {1,0}, {0,-1}, {0,1}};
        Queue<int[]> queue = new LinkedList<>();
        int good = 0;

        for (int i=0; i<row; i++) {
            for (int j=0; j<col; j++) {
                if (grid[i][j] == 2) {
                    queue.add(new int[]{i,j});
                } else if (grid[i][j] == 1){
                    good ++;
                }
            }
        }
        if (good == 0) return 0;

        int min = 0;
        while (!queue.isEmpty() && good > 0) {

            min ++;
            int size = queue.size();
            for (int i=0; i<size; i++) {
                int[] arr = queue.poll();
                for (int[] dir : dirs) {
                    int x = arr[0] + dir[0];
                    int y = arr[1] + dir[1];
                    if (x >=0 && x<row && y>=0 && y<col && grid[x][y] == 1) {
                        grid[x][y] = 2;
                        good --;
                        queue.add(new int[]{x,y});
                    }
                }
            }

        }
        return good > 0 ? -1 : min;

    }
}

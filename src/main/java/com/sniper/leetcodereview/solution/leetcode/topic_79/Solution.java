package com.sniper.leetcodereview.solution.leetcode.topic_79;

/**
 * sniper
 * 2025/4/6 下午1:16
 */
public class Solution {
    public boolean exist(char[][] board, String word) {
        for (int i=0; i<board.length; i++) {
            for (int j=0; j<board[0].length; j++) {
                if (dfs(board, word, i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean dfs(char[][] board, String word, int i, int j, int index) {
        if (index == word.length()) {
            return true;
        }
        if (i <0 || i >=board.length || j <0 || j>= board[0].length ||
                board[i][j] != word.charAt(index)) {
            return false;
        }

        char temp = board[i][j];
        board[i][j] = ' ';

        boolean found = dfs(board, word, i+1, j, index+1) ||
                dfs(board, word, i-1, j, index+1) ||
                dfs(board, word, i, j+1, index+1) ||
                dfs(board, word, i, j-1, index+1);

        board[i][j] = temp;
        return found;
    }
}

package com.agpalace.leetcode.array;

/**
 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/769/
 */
public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {

        for (int i = 0; i < 9; i++) {
            boolean[] row = new boolean[10];
            for (int j = 0; j < 9; j++) {
                int ele = board[i][j] - 48;
                if (ele != -2) {
                    if (row[ele]) {
                        return false;
                    }
                    row[ele] = true;
                }
            }
        }

        for (int i = 0; i < 9; i++) {
            boolean[] col = new boolean[10];
            for (int j = 0; j < 9; j++) {
                int ele = board[j][i] - 48;
                if (ele != -2) {
                    if (col[ele]) {
                        return false;
                    }
                    col[ele] = true;
                }
            }
        }

        for (int i = 0; i < 9; i = i + 3) {
            for (int j = 0; j < 9; j = j + 3) {
                boolean[] sub = new boolean[10];
                for (int k = 0; k < 3; k++) {
                    for (int l = 0; l < 3; l++) {
                        int ele = board[i+k][j+l] - 48;
                        if (ele != -2) {
                            if (sub[ele]){
                                return false;
                            }
                            sub[ele] = true;
                        }
                    }
                }
            }
        }

        return true;
    }

}

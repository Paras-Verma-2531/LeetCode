package POTD;
import java.util.HashSet;
import java.util.Set;
public class SudokoSolver {
    /*
    Ques: https://leetcode.com/problems/valid-sudoku/
     */
    public boolean isValidSudoku(char[][] board) {
        Set <String> set = new HashSet <>();
        for (int row = 0; row < 9; row++) {
            for (int column = 0; column < 9; column++) {
                char number = board[row][column];
                if (number != '.') {
                    if (!set.add(number + " in row " + row) ||
                            !set.add(number + " in column " + column) ||
                            !set.add(number + " in block " + (row / 3) + "," + (column / 3)))
                        return false;
                }
            }
        }
        return true;
    }
}

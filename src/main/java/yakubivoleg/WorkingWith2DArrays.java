package yakubivoleg;

import java.util.Arrays;

public class WorkingWith2DArrays {
    public static void main(String[] args) {
        char [][] board = new char[3][3];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = '-';
            }
        }

        char[][] boardTwo = new char[][] {
                new char[] {'O', '-', '-'},
                new char[] {'O', '-', '-'},
                new char[] {'O', '-', '-'},
        };

        board[0][0] = 'O';
        board[1][1] = 'O';
        board[2][2] = 'O';

        System.out.println(Arrays.deepToString(board));
        System.out.println(Arrays.deepToString(boardTwo));
    }
}

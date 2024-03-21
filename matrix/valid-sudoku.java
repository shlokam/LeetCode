class Solution {
    public boolean isValidSudoku(char[][] board) {

        int[] toValidate = new int[9];

        // validating row
        for (int i = 0; i < 9; ++i) {
            for (int j = 0; j < 9; ++j) {
                if (board[i][j] != '.') {
                    int k = (int) board[i][j] - '0';
                    if (toValidate[k - 1] == 1) {
                        System.out.println("row failed " + i + " " + j);
                        return false;
                    } else
                        toValidate[k - 1] = 1;
                }
            }
            toValidate = new int[9];
        }

        toValidate = new int[9];
        // validating column
        for (int i = 0; i < 9; ++i) {
            for (int j = 0; j < 9; ++j) {
                if (board[j][i] != '.') {
                    int k = (int) board[j][i] - '0';
                    if (toValidate[k - 1] == 1) {
                        System.out.println("column failed " + i + " " + j);
                        return false;
                    } else
                        toValidate[k - 1] = 1;
                }
            }
            toValidate = new int[9];
        }

        toValidate = new int[9];
        // validating each 3x3 grid
        int ind_i = -1, ind_j = -1;
        for (int i = 0; i < 9;) {
            for (int j = 0; j < 9;) {
                if (ind_i == -1 && ind_j == -1) {
                    ind_i = i;
                    ind_j = j;
                }

                // System.out.println(ind_i + "" + ind_j);
                if (ind_i >= 9 || ind_j >= 9)
                    break;

                if (board[ind_i][ind_j] != '.') {
                    int k = (int) board[ind_i][ind_j] - '0';
                    if (toValidate[k - 1] == 1) {
                        System.out.println("grid failed " + ind_i + " " + ind_j);
                        return false;
                    } else
                        toValidate[k - 1] = 1;
                }

                if (ind_i == i + 2 && ind_j == j + 2) {
                    if (j == 6) {
                        i = i + 3;
                        j = 0;
                    } else
                        j = j + 3;
                    ind_i = -1;
                    ind_j = -1;
                    System.out.println("empty validate");
                    toValidate = new int[9];
                } else if (ind_j == j + 2) {
                    ++ind_i;
                    ind_j = j;
                } else {
                    ++ind_j;
                }

            }
        }
        return true;
    }
}
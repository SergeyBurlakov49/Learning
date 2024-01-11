package leetcode.No1572MatrixDiagonalSum;

public class MatrixDiagonalSum {
    public static int diagonalSum(int[][] mat) {
        int result = 0;
        for (int i = 0; i < mat.length; i++) {
            result += mat[i][i];
            if (i != mat.length - i - 1)result += mat[i][mat.length - i - 1];
        }
        return result;
    }

    public static void main(String[] args) {
        diagonalSum(new int[][]{{1,2,3},{4,5,6},{7,8,9}});
    }
}

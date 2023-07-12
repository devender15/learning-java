package leetcode;
import java.util.Arrays;

public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
        };

        int[][] ans = new int[matrix[0].length][matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                ans[j][i] = matrix[i][j];
            }
        }

        System.out.println(Arrays.deepToString(ans));

    }
}

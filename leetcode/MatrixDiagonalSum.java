package leetcode;

import java.util.Arrays;

public class MatrixDiagonalSum {
    public static void main(String[] args) {
        int[][] mat = {{1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}};
        int s = 0;
        int i;
        int x = 0;
        int z = mat[0].length - 1;
        for (i = 0; i < mat.length; i++) {
//            System.out.println("row " + i);
//            System.out.println(x);
//            System.out.println(z);

            if (mat[i][x] == mat[i][z] && x == z) {
                System.out.println(x);
                System.out.println(z);
                s += mat[i][x];
            } else {
                s += mat[i][x] + mat[i][z];
            }

            x += 1;
            z -= 1;
        }


//        System.out.println(Arrays.deepToString(arr));
        System.out.println(s);
    }
}

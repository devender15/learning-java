package leetcode;
import java.util.Arrays;

public class MatrixAfterRotationSame {

    static void rotate90Clockwise(int[][] a)
    {
        int N = a.length;
        // Traverse each cycle
        for (int i = 0; i < N / 2; i++)
        {
            for (int j = i; j < N - i - 1; j++)
            {
                int temp = a[i][j];
                a[i][j] = a[N - 1 - j][i];
                a[N - 1 - j][i] = a[N - 1 - i][N - 1 - j];
                a[N - 1 - i][N - 1 - j] = a[j][N - 1 - i];
                a[j][N - 1 - i] = temp;
            }
        }
    }

//    static void printMatrix(int[][] arr)
//    {
//        for (int i = 0; i < N; i++)
//        {
//            for (int j = 0; j < N; j++)
//                System.out.print( arr[i][j] + " ");
//            System.out.println();
//        }
//    }
    public static void main(String[] args) {
        int[][] arr = { { 1,1 },
                { 0,1 },
                };

        int[][] target = {
                {1,1},
                {1,0},
        };

        // rotation by 90 deg
        for(int i =0; i<4; i++) {
            if(Arrays.deepEquals(arr, target)) {
                System.out.println(true);
            }
            rotate90Clockwise(arr);

        }





//        System.out.println(arr == target);
        System.out.println(Arrays.deepToString(arr));
//        System.out.println(Arrays.deepEquals(arr, target));
    }
}

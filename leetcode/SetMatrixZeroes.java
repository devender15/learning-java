package leetcode;

import java.util.Arrays;
import java.util.ArrayList;

public class SetMatrixZeroes {
    static void changeAcrossRow(int[][] arr, int r) {
        Arrays.fill(arr[r], 0);
    }

    static void changeAcrossColumn(int[][] arr, int c) {
        for (int i = 0; i < arr.length; i++) {
            arr[i][c] = 0;
        }
    }
    public static void main(String[] args) {
        int[][] arr = {
                {1,1,1},
                {1,0,1},
                {1,1,1},
        };

        ArrayList<int[]> ans = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) {
                if(arr[i][j] == 0) {
                    ans.add(new int[]{i,j});
                }
            }
        }


        for (int[] i: ans) {
            changeAcrossRow(arr, i[0]);
            changeAcrossColumn(arr, i[1]);
        }

        System.out.println(Arrays.deepToString(arr));

    }
}

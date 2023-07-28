package leetcode;
import java.util.ArrayList;

public class LuckyNumberFromMatrix {
    static int findAcrossColumn(int[][] arr, int colIndex) {
        int maxNum = arr[0][colIndex];
        for(int[] row: arr) {
            if(row[colIndex] > maxNum) {
                maxNum = row[colIndex];
            }
        }
        return maxNum;
    }
    public static void main(String[] args) {
        int[][] arr = {
                {7,8},
                {1,2},
        };

        ArrayList<Integer> ans = new ArrayList<>();

        for (int[] ints : arr) {
            int minNum = 0;
            for (int j = 0; j < ints.length; j++) {
                if (ints[j] < ints[minNum]) {
                    minNum = j;
                }
            }
            boolean isMax = findAcrossColumn(arr, minNum) == ints[minNum];
            if(isMax) {
                ans.add(ints[minNum]);
            }
        }

        System.out.println(ans);
    }
}

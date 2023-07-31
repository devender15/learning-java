package leetcode;
import java.util.ArrayList;


public class SpiralMatrix {
    public static void main(String[] args) {
            int[][] matrix = {
                    {1,2,3},
                    {4,5,6},
                    {7,8,9},
            };

            ArrayList<Integer> ans = new ArrayList<>();

            while(ans.size() < matrix.length * matrix[0].length) {
                int top, bottom, right, left;
                top = 0;
                bottom = matrix.length - 1;
                left = 0;
                right = matrix[0].length - 1;

                for (int i=left; i<=right; i++) {
                    ans.add(matrix[top][i]);
                }
                top += 1;

                for (int i=top; i<=bottom; i++) {
                    ans.add(matrix[i][right]);
                }
                right -= 1;

                for (int i=right; i>=left; i--) {
                    ans.add(matrix[bottom][i]);
                }
                bottom -= 1;

                for (int i=bottom; i>=top; i--) {
                    ans.add(matrix[i][left]);
                }
                left += 1;
            }

        System.out.println(ans);
    }
}

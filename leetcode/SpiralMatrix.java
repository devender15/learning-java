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



            }
    }
}

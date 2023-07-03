import java.util.Arrays;
import java.util.Scanner;

public class TwoDArrays {
    public static void main(String[] args) {
        /*
            1 2 3
            4 5 6
         */

        // int[][] nums = new int[3][]; // no. of columns is not mandatory

//        int[][] nums = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9},
//        };
        int[][] nums = new int[3][3];
        Scanner in = new Scanner(System.in);
        System.out.println(Arrays.toString(nums[0])); // it will give the no. of rows

        for(int row=0; row<nums.length; row++) {
            for(int col=0; col<nums[row].length; col++) {
                nums[row][col] = in.nextInt();
            }
        }

        for(int row=0; row<nums.length; row++) {
            for(int col=0; col<nums[row].length; col++) {
                System.out.print(nums[row][col] + " ");
            }
            System.out.println();
        }

//        System.out.println(Arrays.toString(nums));
    }
}

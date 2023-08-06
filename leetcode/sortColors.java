package leetcode;
import java.util.Arrays;

public class sortColors {
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        int i, j, temp;
        boolean swapped;
        // bubble sort
        for ( i = 0; i < nums.length - 1; i++) {
            swapped = false;
            for (j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j+1]) {
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped) {
                break;
            }
        }

        System.out.println(Arrays.toString(nums));
    }
}

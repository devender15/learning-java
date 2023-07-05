package leetcode;
import java.util.Arrays;

public class ConcatenationOfArray {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] ans = new int[2*arr1.length];

        int n = 0;
        for (int i = 0; i < ans.length; i++) {
            if(n > arr1.length - 1) {
                n = 0;
            }
            ans[i] = arr1[n];
            n += 1;
        }

        System.out.println(Arrays.toString(ans));
    }
}

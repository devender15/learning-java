package leetcode;
import java.util.Arrays;
public class HowManySmallerThanCurrent {
    public static void main(String[] args) {
        int[] arr = {6,5,4,8};
        int[] ans = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i]>arr[j] && i!=j) {
                    ans[i] += 1 ;
                }
            }
        }

        System.out.println(Arrays.toString(ans));
    }
}

package leetcode;
import java.util.Arrays;

public class ArrayFromPermutation {

    static int[] buildArray(int[] arr) {
        int[] newArr = new int[arr.length];

        for (int i = 0; i < newArr.length; i++) {
            int oldIdxNum = arr[arr[i]];
            newArr[i] = oldIdxNum;
        }

        return newArr;
    }

    public static void main(String[] args) {
        int[] arr = {5,0,1,2,3,4};
        int[] newArr = buildArray(arr);
        System.out.println(Arrays.toString(newArr));
    }
}

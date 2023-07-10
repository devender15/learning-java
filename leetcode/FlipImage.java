package leetcode;
import java.util.Arrays;

public class FlipImage {
    static int[] reverse(int[] arr, int n) {
        int[] modifiedArr = new int[arr.length];
        int j = n;
        for (int i = 0; i < arr.length; i++) {
            modifiedArr[i] = arr[j-1];
            j -= 1;
        }
        return modifiedArr;
    }

    static void invertElements(int[] reversedArray) {
        for (int i = 0; i < reversedArray.length;  i++) {
            if(reversedArray[i] == 0) {
                reversedArray[i] = 1;
            } else {
                reversedArray[i] = 0;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,0,0,1};
        int[] newArr = reverse(arr, arr.length);
        invertElements(newArr);
        System.out.println(Arrays.toString(newArr));
    }
}

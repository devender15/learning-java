package algo;

import java.util.Arrays;

public class CycleSort {
    static void sort(int[] arr) {
        int i = 0;
        while (i<arr.length) {
            int correctIndex = arr[i] - 1;
            if(arr[i] != arr[correctIndex]) {
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            } else {
                i += 1;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

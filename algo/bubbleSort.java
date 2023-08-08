package algo;

import java.util.Arrays;

public class bubbleSort {
    static void sort(int[] arr) {
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            // for each step, max item will come at the last respective index
            for (int j = 1; j < arr.length - i; j++) {
                // swap if the item is smaller than the previous  item
                if(arr[j] < arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            // if no swapping occured, means the array is sorted and we dont need to do comparisons
            if(!swapped) break;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

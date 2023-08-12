package algo;
import java.util.Arrays;

public class SelectionSort {
    static  void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = 0; i <= end; i++) {
            if(arr[i] > arr[max]) {
                max = i;
            }
        }
        return  max;
    }
    static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // find the max element and then swap it with the correct index
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);
        }
    }
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1,5};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

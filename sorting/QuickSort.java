package sorting;

import java.util.Arrays;

public class QuickSort {

    static void sort(int[] arr, int low, int high) {
        if(low >= high) return;

        int s = low;
        int e = high;
        int m = s+(e-s)/2;
        int p = arr[m];

        while(s<=e) {
            while(arr[s]<p) s+=1;
            while(arr[e]>p) e-=1;

            if(s<=e) {
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s+=1;
                e-=1;
            }
        }
        sort(arr, low, e);
        sort(arr, s, high);
    }
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        sort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}

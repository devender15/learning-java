package sorting;

import java.util.Arrays;

public class MergeSort {
    static int[] sort(int[] arr) {
        if(arr.length == 1) return arr;

        int mid = arr.length / 2;

        int[] left = sort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = sort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    static int[] merge(int[] left, int[] right) {
        int[] mix = new int[left.length+right.length];

        int i=0, j=0, k=0;
        System.out.println("i start: " + i);
        while(i<left.length && j<right.length) {
            if(left[i]<right[j]) {
                System.out.println(left[i]);
                System.out.println(right[j]);
                mix[k] = left[i];
                i+=1;
            } else {
                mix[k] = right[j];
                j+=1;
            }
            k+=1;
        }
        System.out.println("i end: " + i);
        // it may be possible that one of the array is not finished
        while(i<left.length) {
            mix[k] = left[i];
            i+=1;
            k+=1;
        }

        while(j<right.length) {
            mix[k] = right[j];
            j+=1;
            k+=1;
        }

        return mix;
    }

    static void mergeSortInPlace(int[] arr, int s, int e) {
        if(e-s == 1) return;

        int mid = (s+e)/2;

        mergeSortInPlace(arr, s, mid);
        mergeSortInPlace(arr, mid, e);

        mergeInPlace(arr, s, mid, e);
    }

    static void mergeInPlace(int[] arr, int s, int m, int e) {
        int[] mix = new int[e-s];

        int i=s, j=m, k=0;

        while(i<m && j<e) {
            if(arr[i]<arr[j]) {
                mix[k] = arr[i];
                i+=1;
            } else {
                mix[k] = arr[j];
                j+=1;
            }
            k+=1;
        }

        while(i<m) {
            mix[k] = arr[i];
            i+=1;
            k+=1;
        }

        while(j<e) {
            mix[k] = arr[j];
            j+=1;
            k+=1;
        }

        for (int l = 0; l < mix.length; l++) {
            arr[s+l] = mix[l];
        }
    }

    public static void main(String[] args) {
        int[] arr = {-2,3,-5};
//        System.out.println(mergeSortInPlace(arr, 0, arr.length));
//        mergeSortInPlace(arr, 0, arr.length);
        System.out.println(Arrays.toString(sort(arr)));
    }
}

package practice;

import java.util.Arrays;

public class MergeSort {

    static int[] sort(int[] arr) {
        if(arr.length <= 1) return arr;
        int m = arr.length/2;
        int[] left = sort(Arrays.copyOfRange(arr, 0, m));
        int[] right = sort(Arrays.copyOfRange(arr, m, arr.length));
        return merge(left, right);
    }

    static int[] merge(int[] left, int[] right) {
        int[] mix = new int[left.length+right.length];
        int i=0, j=0, k=0;
        while(i<left.length && j<right.length) {
            if(left[i]<right[j]) {
                mix[k]=left[i];
                i+=1;
            } else {
                mix[k]=right[j];
                j+=1;
            }
            k+=1;
        }
        while(i<left.length) {
            mix[k]=left[i];
            i+=1;
            k+=1;
        }
        while(j<right.length) {
            mix[k]=right[j];
            j+=1;
            k+=1;
        }
        return mix;
    }

    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        System.out.println(Arrays.toString(sort(arr)));
    }
}

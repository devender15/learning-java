package leetcode;

import java.util.Arrays;

public class IfNandDoubleExists {
    static void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int min_idx = i;
            for (int j = i+1; j < n; j++) {
                if(arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    static int search(int[] arr, int s, int e, int target, int comp) {
        if(s>e) {
            return  -1;
        }
        int mid = s + (e-s) / 2;
        if(2 * target == arr[mid] && comp != mid) {
            return mid;
        } else if(2*target < arr[mid]) {
            return search(arr, s, mid-1, target, comp);
        } else {
            return  search(arr, mid+1, e, target, comp);
        }
    }

    static boolean checkIfExist(int[] arr) {
        int i=0;
        while(i<arr.length) {
            int idx = search(arr, 0, arr.length-1, arr[i], i);
            if(idx != -1) {
                return true;
            }
            i += 1;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {-2,0,10,-19,4,6,-8};
        sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(checkIfExist(arr));
    }
}

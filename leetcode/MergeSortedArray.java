package leetcode;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int m = 3;
        int n = 3;

        for (int i = 0; i < n ; i++) {
            nums1[m] = nums2[i];
            m += 1;
        }

        // sorting the nums1 array using bubble sort algorithm


        for (int i = 0; i < nums1.length; i++) {
            boolean swapped = false;
            for (int j = 0; j < nums1.length - i - 1; j++) {
                if(nums1[j] > nums1[j+1]) {
                    int temp = nums1[j];
                    nums1[j] = nums1[j+1];
                    nums1[j+1] = temp;
                    swapped = true;
                }
            }

            // if swapping doesn't occur then break the loop
            if(!swapped) break;
        }

        System.out.println(Arrays.toString(nums1));

    }
}

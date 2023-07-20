package algo;

public class OrderAgnosticBinarySearch {
    static int orderAgnosticBS(int[] arr, int target) {
        int s = 0;
        int e = arr.length - 1;

        // find whether the array is sorted in ascending or descending order
        boolean isAsc = arr[s] < arr[e];

        while(s <= e) {
            int mid = s + (e - s) / 2;

            if(arr[mid] == target) {
                return mid;
            }

            if(isAsc) {
                if(target < arr[mid]) {
                    e = mid - 1;
                }
                else {
                    s = mid + 1;
                }
            } else {
                if(target > arr[mid]) {
                    e = mid - 1;
                }
                else {
                    s = mid + 1;
                }
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        int[] nums = {-5, 2, 5, 10, 11, 30, 50};
        System.out.println(orderAgnosticBS(nums, 10));

    }
}

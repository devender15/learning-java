package assignments.methods;

public class InfiniteArraySearch {

    static int ans(int[] arr, int target) {
        // finding the range
            // first start with the range of 2
        int s = 0;
        int e = 1;

        // condition for the target to lie in the range
        while(target > arr[e]) {
            int temp = e + 1;
            // size of the array = end - start + 1
            // end => previous end + sizeofArray * 2
            e = e + (e - s + 1) * 2;
            s = temp;
        }
        return search(arr, target, s, e);
    }

    static int search(int[] arr, int target, int s, int e) {
        while (s <= e) {
            int mid = s + (e-s) / 2;

            if(target < arr[mid]) {
                e  = mid - 1;
            } else if(target > arr[mid]) {
                s = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        // start with the box of size 2
        int[] arr = {2, 5, 10, 100, 140, 200, 235, 500};
        int target = 100;

        System.out.println(ans(arr, target));
    }
}

package assignments.methods;

public class FindCeilingNum {
    static int findCeiling(int[] arr, int target) {

        if(target > arr[arr.length - 1]) {
            return -1;
        }

        int s = 0;
        int e = arr.length - 1;

        while (s <= e) {
            int mid = s + (e-s) / 2 ;

            if(target > arr[mid]) {
                s = mid + 1;
            } else if(target < arr[mid]) {
                e = mid - 1;
            } else if(target == arr[mid]) {
                return mid;
            }
        }

        return s;
    }
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 15;

        System.out.println(findCeiling(arr, target));
    }
}

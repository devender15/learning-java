package leetcode;

public class SplitArrayLargestSum {

    static int splitArray(int[] nums, int k) {
        int s = 0;
        int e = 0;

        for (int num : nums) {
            s = Math.max(s, num); // in the end of the loop, s will contain the max value of the array
            e += num;
        }

        // binary search
        while(s<e) {
            // try for the middle as potential ans
            int mid = s + (e-s) / 2;

            // calculate how many pieces you can divide this in with this max sum
            int sum = 0;
            int pieces = 1;
            for(int n: nums) {
                if(sum + n > mid) {
                    // you cannot add num in this subarray, make new one
                    // say you add this num in new subarray, then sum = n
                    sum = n;
                    pieces += 1;
                } else {
                    sum += n;
                }
            }

            if(pieces > k) {
                s = mid + 1;
            } else {
                e = mid;
            }
        }

        return s; // here s == e
    }
    public static void main(String[] args) {
        int[] arr = {7,2,5,10,8};
        int k = 2;
    }
}

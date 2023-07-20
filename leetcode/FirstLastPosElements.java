package leetcode;
import java.util.Arrays;

public class FirstLastPosElements {
    static int[] searchRange(int[] nums, int target ) {
        int[] ans = {-1, -1};

        ans[0] = search(nums, target, true);
        if(ans[0] != -1) {
            ans[1] = search(nums, target, true);
        }

        return ans;
    }

    static  int search(int[] nums, int target, boolean isFirstOccurence) {
        int ans = -1;
        int s = 0;
        int e = nums.length - 1;

        while(s<=e) {
            int mid = s + (e-s) / 2;
            if(target < nums[mid]) {
                e = mid - 1;
            } else if(target > nums[mid]) {
                s = mid + 1;
            } else {
                ans = mid;
                if(isFirstOccurence) {
                    e = mid - 1;
                } else {
                    s = mid + 1;
                }
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        System.out.println(Arrays.toString(searchRange(nums, target)));
    }
}

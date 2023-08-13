package leetcode;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        int n = nums.length;
        int currentElem = nums[0];
        int count = 0;

        for (int i = 0; i < n; i++) {
            if(count == 0) {
                currentElem = nums[i];
                count = 1;
            } else if(currentElem == nums[i]) {
                count += 1;
            } else {
                count -= 1;
            }
        }

        // checking for majority element
        for (int num : nums) {
            if (num == currentElem) {
                count += 1;
            }

            if (count > n / 2) {
                System.out.println(num);
                break;
            }
        }
    }

}

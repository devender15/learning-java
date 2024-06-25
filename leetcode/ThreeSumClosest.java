package leetcode;


import java.util.Arrays;

public class ThreeSumClosest {

    static int solution(int[] nums, int target) {
        int result = nums[0] + nums[1] + nums[2];
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            int j=i+1, k=nums.length-1;
            while (j<k) {
                int sum = nums[i] + nums[j] + nums[k];
                if(sum>target) {
                    k-=1;
                } else {
                    j+=1;
                }

                if(Math.abs(sum-target) < Math.abs(result-target)) {
                    result = sum;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,1,0};
        int target = -100;
        System.out.println(solution(arr, target));
    }
}

package leetcode;

public class SingleNonDuplicate {
    static int check(int[] nums) {
        int i=0;
        boolean exist=true;
        while(i<nums.length) {
            int s=nums[i+1];
            int e=nums.length-1;
            int target = nums[i];
            while(s<=e) {
                int mid=s+(e-s)/2;
                if(nums[mid] == target) {
                    i=mid+1;
                    exist=false;
                } else if(target > nums[mid]) {
                    s=mid+1;
                } else {
                    e=mid-1;
                }
            }
            if(exist) {
                return nums[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {1,1,2,3,3,4,4,8,8};
        System.out.println(check(nums));
    }
}

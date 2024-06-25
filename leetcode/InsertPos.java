package leetcode;

public class InsertPos {

    static int binarySearch(int[] nums, int target) {
        int s=0, e=nums.length-1;
        while(s<e) {
            int m=s+(e-s)/2;
//            System.out.println(m);
            if(nums[m]==target) {
                return m;
            } else if(nums[m]>target) {
                e=m-1;
            } else {
                s=m+1;
            }
        }
        return s+1;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 5;
        System.out.println(binarySearch(nums, target));
    }
}

package leetcode;

import java.util.List;
import java.util.ArrayList;

public class ThreeSum {
    static List<List<Integer>> solution(int[] nums) {
        int i=0;
        List<List<Integer>> ans = new ArrayList<>();
        while(i<nums.length-2) {
            int j=i+1, k=j+1;
            int target = -1 * nums[i];
            while(j<nums.length && k<nums.length) {
                System.out.println(j);
                System.out.println(k);
                System.out.println(target);
                if(nums[j]+nums[k]==target) {
                    List<Integer> temp = new ArrayList<Integer>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k]);
                    ans.add(temp);
                    break;
                } else if(k>=nums.length-1 && j<nums.length-1) {
                    j+=1;
                    k=j+1;
                } else {
                    k+=1;
                }
            }
            i+=1;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        System.out.println(solution(nums));
    }
}

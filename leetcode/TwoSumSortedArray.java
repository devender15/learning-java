package leetcode;

import java.util.Arrays;

public class TwoSumSortedArray {

    static int[] solution(int[] numbers, int target) {
        int i=0;
        int[] ans=new int[2];
        while(i<numbers.length-1) {
            System.out.println("i " + i);
            int j=i+1;
            int e=numbers.length-1;
            while(j<=e) {
                int m=j+(e-j)/2;
                System.out.println("m "+m);
                System.out.println("i " + i);
                if(numbers[i]+numbers[m]==target) {
                    ans[0]=i+1;
                    ans[1]=m+1;
                    return ans;
                } else if(numbers[i]+numbers[m]>target) {
                    e=m-1;
                } else {
                    j=m+1;
                }
            }
//            return ans;
            i+=1;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] numbers = {5,25,75};
        int target = 100;
        System.out.println(Arrays.toString(solution(numbers, target)));
    }
}

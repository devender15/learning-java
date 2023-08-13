package leetcode;

public class HouseRobber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1};
        int s1 = 0;
        int s2 = 0;

        for (int i = 0; i < arr.length; i++) {
            if(i%2 == 0) {
                s1 += arr[i];
            } else {
                s2 += arr[i];
            }
        }
        System.out.println(s1);
        System.out.println(s2);

        System.out.println(Math.max(s1, s2));
    }
}

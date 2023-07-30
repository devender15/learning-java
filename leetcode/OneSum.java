package leetcode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OneSum {
    public static void main(String[] args) {
        int[] digits = {9,8,7,6,5,4,3,2,1,0};

        // converting array to num
        long oldNum = 0;
        for (int num : digits) {
            System.out.println(oldNum*10+num);
            oldNum = oldNum * 10 + num;
        }
        System.out.println(oldNum);
        // increment the value by 1
        oldNum += 1;
        System.out.println(oldNum);
        // converting num to array
        List<Integer> arl = new ArrayList<>();


        while (oldNum > 0) {
            arl.add(0, (int) (oldNum % 10));
            oldNum /= 10;
        }

        int[] ans = new int[arl.size()];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = arl.get(i);
        }

        System.out.println(Arrays.toString(ans));
    }
}

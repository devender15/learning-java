package leetcode;

import java.util.ArrayList;
import java.util.List;

public class ArrayFormOfInteger {
    public static void main(String[] args) {
        int[] num = {9,9,9,9,9};
        int k = 1;
        int oldNum = 0;
        List<Integer> ans = new ArrayList<>();

        for(int i: num) {
            oldNum = oldNum * 10 + i;
        }

        System.out.println(oldNum);

        oldNum += k;

        while (oldNum > 0) {
            ans.add(0, oldNum%10);
            oldNum /= 10;
        }

        System.out.println(ans);
    }
}

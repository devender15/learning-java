package leetcode;

import java.util.Arrays;

public class ToLowercase {
    public static void main(String[] args) {
        String s = "Hello";
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if(Character.isUpperCase(arr[i])) {
                arr[i] = Character.toLowerCase(arr[i]);
            }
        }

        int ascii = 72;
        System.out.println(Arrays.toString(arr));
        System.out.println((char) (ascii));
    }
}

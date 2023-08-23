package strings;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String name = "dev is good boy";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toUpperCase());
        System.out.println(Arrays.toString(name.split(" ")));
    }
}

package assignments.methods;

import java.util.Scanner;

public class Palindrome {
    static  boolean isPalindrome(int n) {
        int og = n;
        int rev = 0;
        while(n>0) {
            int rem = n%10;
            rev = rev * 10 + rem;
            n /= 10;
        }
        return og == rev;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number");
        int n = in.nextInt();
        boolean ans = isPalindrome(n);
        System.out.println(ans);
    }
}

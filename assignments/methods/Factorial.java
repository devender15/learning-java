package assignments.methods;

import java.util.Scanner;

public class Factorial {
    static int factorial(int n) {
//        if(n <= 1) return  1;
//        return (n) * factorial(n-1);
        int ans = 1;
        for (int i = 1; i <= n; i++) {
            ans *= i;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a number");
        int n = in.nextInt();
        int factorial_ans = factorial(n);
        System.out.println(factorial_ans);
    }
}

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the nth number");
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;

        while(count <= n) {
            int temp = b;
            b += a;
            a = temp;
            count += 1;
        }

        System.out.println("The fibonacci series till the nth number is " + b);
    }
}

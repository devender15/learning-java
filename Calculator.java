import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome To iCalculator");

        while(true) {
            System.out.println("Please enter the first number");
            int a = in.nextInt();

            System.out.println("Please enter the second number");
            int b = in.nextInt();

            System.out.println("Please select an operation for these two numbers");
            char op = in.next().trim().charAt(0);

            if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                if(op == '+') {
                    System.out.println(a + b);
                }
                else if(op == '-') {
                    System.out.println(a - b);
                }
                else if(op == '*') {
                    System.out.println(a * b);
                }
                else if(op == '/') {
                    System.out.println(a/b);
                } else {
                    System.out.println(a%b);
                }
            } else {
                break;
            }
        }
    }
}

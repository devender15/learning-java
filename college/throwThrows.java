package college;

import java.util.Scanner;

public class throwThrows {
    static void checkAge(int age) throws ArithmeticException {
        if(age<18) {
            throw new ArithmeticException("This age is not sufficient!");
        } else {
            System.out.println("You are eligible for voting!");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your age: \n");
        int age = in.nextInt();
        checkAge(age);
    }
}

// for taking inputs, we have to java Scanner class
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.print("hello friend");
//        System.out.print("hello friend2");

        // taking input from the user from default system input
        Scanner input = new Scanner(System.in);

        // taking an integer input
        System.out.println("Please enter your age");
        int age = input.nextInt();
        System.out.format("You entered your age: %d", age);
    }
}

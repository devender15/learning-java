import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        // while loops
//        int a = 1;
//        while(a < 10) {
//            System.out.format("Current number is %d\n", a);
//            a += 1;
//        }

        // for loops
//        for(int i=0; i<5; i++) {
//            System.out.println(i);
//        }

        // adding numbers using for loop
//        Scanner input = new Scanner(System.in);
//        System.out.println("Please enter the final number to which you want to add");
//        int n = input.nextInt();
//        int s = 0;
//        for(int i=0; i<n; i++) {
//            s += i;
//        }
//
//        System.out.format("The final sum of all the numbers till %d is %d", n, s);

        // do while loop
        int test = 5;
        do {
            test += 10;
            System.out.println(test);
        } while( test < 4);
    }
}

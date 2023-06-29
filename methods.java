import java.util.Scanner;

public class methods {

    static int sum(int a, int b) {
        return a+b;
    }
    static String greet(String name) {
        return "Good evening " + name;
    }

    static  void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    public static void main(String[] args) {
//        System.out.println(sum(6, 9));

        // greeting method
//        Scanner in = new Scanner(System.in);
//
//        System.out.println("Please enter your name");
//        String name = in.next();
//        System.out.println(greet(name));
//
        // when using swap method, the original values won't change because we are creating new objects
        int a = 2;
        int b = 6;

        swap(a, b);

        System.out.println(a);
        System.out.println(b);
    }
}

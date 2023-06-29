package assignments.methods;

import java.util.Scanner;

public class MaxMin {
    static int getMax(int a, int b, int c) {
        int max = a;
        if(b>a) max = b;
        else if(c>b) max = c;
        return max;
    }

    static int getMin(int a, int b, int c) {
        int min = a;
        if(b<a) min = b;
        else if(c<b) min = c;
        return min;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("enter a number a");
        int a = in.nextInt();
        System.out.println("enter a number b");
        int b = in.nextInt();
        System.out.println("enter a number c");
        int c = in.nextInt();

        System.out.println("Maximum : " + getMax(a, b, c));
        System.out.println("Minimum : " + getMin(a, b, c));
    }
}

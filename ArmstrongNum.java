import java.util.Scanner;

public class ArmstrongNum {

    static boolean isArmstrongNum(int n) {
        int s = 0;
        int og = n;
        while(n > 0) {
            int lastDigit = n%10;
            s += lastDigit * lastDigit * lastDigit;;
            n = n/10;
        }
        return s == og;
    }
    public static void main(String[] args) {
        // create a program which will check if any 3-digit number is an armstrong number or not
        Scanner in  = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = in.nextInt();

        boolean ans = isArmstrongNum(n);
        System.out.println(ans);
    }
}

package recursion;

public class PracticeOne {
    static void printRev(int n) {
        if(n==0) {
            return;
        }
        printRev(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        printRev(5);
    }
}

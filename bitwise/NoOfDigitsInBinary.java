package bitwise;

public class NoOfDigitsInBinary {
    public static void main(String[] args) {
        int n = 7;
        int b = 2;
        int ans = (int)(Math.log(n)/Math.log(b)) + 1;
        System.out.println(ans);
    }
}

package recursion;

public class First {
    static int fibo(int n) {
        if(n<2) {
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }
    public static void main(String[] args) {
        // fibonacci number
        System.out.println(fibo(6));
    }
}

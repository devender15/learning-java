package bitwise;

public class PrimeNunbers {
    static boolean isPrime(int n) {
        if(n<=1) {
            return false;
        }
        int c = 2;
        while(c*c <= n) {
            if(n%c==0) {
                return false;
            }
            c += 1;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isPrime(6));
    }
}

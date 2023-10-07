package bitwise;

public class NewtonSqrt {
    static double sqrt(double n) {
        double root;
        double x = n;
        while (true) {
            root = 0.5 * (x+(n/x));
            if(Math.abs(root - x) < 0.5) {
                break;
            }
            x = root;
        }
        return root;
    }
    public static void main(String[] args) {
        System.out.println(sqrt(40));
    }
}

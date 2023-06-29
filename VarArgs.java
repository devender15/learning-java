import java.util.Arrays;

public class VarArgs {
    static void fun(int ...v) {
        System.out.println(Arrays.toString(v));
//        System.out.println(v);
    }
     // variable arguments must be at last position
    static  void mixed(int a, int b, int c, char ...v) {
//        System.out.print(a, b, Arrays.toString(v));
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
    public static void main(String[] args) {
        fun(2,3,4,5,6,7);
        mixed(1, 2, 3, 'a', 'b', 'c', 'd');
    }
}

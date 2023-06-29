public class MethodsOverloading {
    static void fun(int a) {
        System.out.println("I am fun 1");
    }

    static void fun(int a, int b) {
        System.out.println("I am fun 2");
    }

    public static void main(String[] args) {
        fun(1);
        fun(1, 2);
    }
}

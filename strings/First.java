package strings;

public class First {
    public static void main(String[] args) {
        String a = "hello";
        String b = "hello";

//        a.toUpperCase();
        a = a+"4"; // changing one reference variable won't affect the other ref variable

        System.out.println(a);
        System.out.println(b);
    }
}

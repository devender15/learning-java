package strings;

public class First {
    public static void main(String[] args) {
        String a = "hello";
        String b = "hello";
        String word = "abc";

//        a.toUpperCase();
        a = a+"4"; // changing one reference variable won't affect the other ref variable

//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(word.substring(0, 1));
        for (int i = 0; i < word.length(); i++) {
            System.out.println(word.substring(0, i+1));
        }
    }
}

package recursion;

public class Subsequence {
    static void subsq(String p, String up) {
        if(up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        subsq(p, up.substring(1));
        subsq(p+ch, up.substring(1));
     }
    public static void main(String[] args) {
        subsq("", "abc");
    }
}

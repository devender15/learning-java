package recursion;

public class LetterCombinationOfPhoneNumber {
    static void combination(String p, String up) {
        if(up.isEmpty()) {
            System.out.println(p);
            return;
        }
        int digit = up.charAt(0) - '0';
        for (int i = (digit-1)*3; i < digit*3; i++) {
            char ch = (char) ('a'+i);
            combination(p+ch, up.substring(1));
        }
    }
    public static void main(String[] args) {
        combination("", "12");
    }
}

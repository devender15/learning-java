package strings;

public class Palindrome {
    static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        if(s.length() == 0) {
            return true;
        }
        for (int i = 0; i < s.length() / 2; i++) {
            char start = s.charAt(i);
            char end = s.charAt(s.length() - 1 - i);
            if(start != end) {
                return  false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "";
        System.out.println(isPalindrome(s));
    }
}

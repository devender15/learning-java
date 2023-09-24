package leetcode;

public class LongPressedName {
    public static void main(String[] args) {
        String name = "alex";
        String typed = "aaleexa";
        StringBuilder test = new StringBuilder();
        int i=0, j=0;
        while(j<typed.length()) {
            if(typed.charAt(j) == name.charAt(i)) {
                test.append(typed.charAt(j));
                i += 1;
            }
            j += 1;
        }
        System.out.println(test);
    }
}

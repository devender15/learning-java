package leetcode;

public class freqAlphabets {
    static char getAlphabet(int n) {
        return (char) ((char) n+96);
    }
    public static void main(String[] args) {
        String input = "10#11#12";
        StringBuilder ans = new StringBuilder();
        int i = 0;
        while(i<input.length()) {
            if(i+2 < input.length() && input.charAt(i+2) == '#') {
                int n = Integer.parseInt(input.substring(i, i+2));
                ans.append(getAlphabet(n));
                i += 3;
            } else {
                int n = input.charAt(i) - '0';
                ans.append(getAlphabet(n));
                i += 1;
            }
        }

        System.out.println(ans);



//        for( int i = 0; i < input.length(); i++) {
//            int position = input.charAt(i) - 'a' + 1;
//            System.out.println(position);
//        }
//        System.out.println(getAlphabet(10));
    }
}

package recursion;

public class Strings {
    static String skip(String up) {
        if(up.isEmpty()) {
//            System.out.println(p);
            return "";
        }
        char ch = up.charAt(0);
        if(ch == 'a') {
            return skip(up.substring(1));
        } else {
            return ch + skip(up.substring(1));
        }
    }

    static String skipWord(String up, String word) {
        if(up.isEmpty()) return "";

        if(up.startsWith(word)) {
            return skipWord(up.substring(word.length()), word);
        } else {
            return up.charAt(0) + skipWord(up.substring(1), word);
        }
    }

    public static void main(String[] args) {
//        System.out.println(skip("ackerman"));
        System.out.println(skipWord("ackerappleban", "ban"));
    }
}

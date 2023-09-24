package leetcode;

public class StrStr {
    public static void main(String[] args) {
        String haystack = "hello";
        String needle = "ll";
        int n = needle.length();
        int i = 0;
        int ans = 0;
        int idx = 0;
        StringBuilder test = new StringBuilder();

//        if(!haystack.contains(needle)) System.out.println(-1);
//        while(i<haystack.length()) {
//            String sub = haystack.substring(i, i+n);
//            System.out.println(sub);
//            if(sub.equals(needle)) {
//                ans = idx;
//                break;
//            } else {
//                i += n;
//            }
//            idx += 1;
//        }

//        System.out.println(ans);
        for (int j = 0; j < haystack.length(); j++) {
            if(test.indexOf(String.valueOf(haystack.charAt(j))) == -1) {
                test.append(haystack.charAt(j));
            }
        }

        System.out.println(test);
    }
}

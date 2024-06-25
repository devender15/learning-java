package recursion;

import java.util.ArrayList;

public class Permutation {
    static void permutations(String p, String up) {
        if(up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            permutations(f+ch+s, up.substring(1));
        }
    }

    static ArrayList<String> perm(String p, String up) {
        if(up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i);
            ans.addAll(perm(f+ch+s, up.substring(1)));
        }
        return ans;
    }

    static int counts(String p, String up) {
        if(up.isEmpty()) return 1;
        char ch = up.charAt(0);
        int count = 0;
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i);
            count += counts(f+ch+s, up.substring(1));
        }
        return count;
    }

    public static void main(String[] args) {
        String test = "abc";
//        permutations("", test);
        ArrayList<String> ans = perm("", test);
//        System.out.println(ans);

        System.out.println(counts("", test));
    }
}

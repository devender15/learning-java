package leetcode;

public class EqualStrings {
    public static void main(String[] args) {
        String[] arr1 = {"ab", "c"};
        String[] arr2 = {"a", "bc"};

        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();

        for (String s : arr1) {
            s1.append(s);
        }

        for(String s: arr2) {
            s2.append(s);
        }

//        System.out.println(s1.toString().equals(s2.toString()));
        System.out.println(String.join("", arr1));
    }
}

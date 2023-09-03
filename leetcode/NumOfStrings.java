package leetcode;

public class NumOfStrings {
    public static void main(String[] args) {
        String[] patterns = {"a","abc","bc","d"};
        String word = "abc";
        int counter = 0;
        for(int i =0; i<patterns.length; i++) {
            if(word.contains(patterns[i])) {
                counter += 1;
            }
        }
        System.out.println(counter);
    }
}

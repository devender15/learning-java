package leetcode;
import java.util.ArrayList;
import java.util.List;

public class ItemsMatchingRule {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> items = new ArrayList<>();
        items.add(new ArrayList<>() {{
            add("phone");
            add("blue");
            add("pixel");
        }});

        items.add(new ArrayList<>() {{
            add("computer");
            add("silver");
            add("lenovo");
        }});

        items.add(new ArrayList<>() {{
            add("phone");
            add("gold");
            add("iphone");
        }});

//        System.out.println(items);

        int ans = 0;
        String ruleKey = "color";
        String ruleValue = "silver";
        for (List<String> j : items) {
            if (ruleKey == "type" && j.get(0).equals(ruleValue)) {
                ans += 1;
            } else if (ruleKey == "color" && j.get(1).equals(ruleValue)) {
                ans += 1;
            } else if (ruleKey == "name" && j.get(2).equals(ruleValue)) {
                ans += 1;
            }
        }

        System.out.println(ans);
    }
}

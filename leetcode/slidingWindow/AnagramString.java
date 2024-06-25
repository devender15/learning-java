package leetcode.slidingWindow;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class AnagramString {

    static List<Integer> solution(String s, String p) {
        List<Integer> ans=new ArrayList<>();
        HashMap<Character, Integer> map=new HashMap<>();
        int k=p.length();
        for(int z=0; z<k; z++) {
            if(map.containsKey(p.charAt(z))) {
                map.put(p.charAt(z), map.get(p.charAt(z))+1);
            } else {
                map.put(p.charAt(z), 1);
            }
        }
        int counter=map.size();
        int i=0,j=0;
        while(j<s.length()) {
            if(map.containsKey(s.charAt(j))) {
                map.put(s.charAt(j), map.get(s.charAt(j))-1);
                if(map.get(s.charAt(j))==0) counter-=1;
            }
            if(j-i+1 < k) {
                j+=1;
                continue;
            } else if(j-i+1 == k) {
                if(counter==0) {
                    ans.add(i);
                }
                if(map.containsKey(s.charAt(i))) {
                    if(map.get(s.charAt(i))==0) counter+=1;
                    map.put(s.charAt(i), map.get(s.charAt(i))+1);
                }
                i+=1;
                j+=1;
            }
            System.out.println(map);
        }
        return ans;
    }

    public static void main(String[] args) {
        String s="abab";
        String p="ab";
        System.out.println(solution(s, p));
    }
}

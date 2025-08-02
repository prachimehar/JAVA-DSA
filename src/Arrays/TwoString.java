package Arrays;

import java.util.HashSet;

public class TwoString {
    public static String twoStrings(String s1, String s2) {

        HashSet<Character> set = new HashSet<>();
        for(char ch : s1.toCharArray()){
            set.add(ch);
        }
        for(char ch : s2.toCharArray()){
            if(set.contains(ch)){
                return "yes";
            }
        }
        return "no";
    }
    public static void main(String[] args) {
        String s1 = "and";
        String s2 = "art";

        System.out.println(twoStrings(s1,s2));

    }
}

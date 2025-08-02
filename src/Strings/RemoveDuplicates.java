package Strings;

import java.util.LinkedHashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "programming";
        StringBuilder result = new StringBuilder();
        LinkedHashSet<Character> seen = new LinkedHashSet<>();

        for (char c : str.toCharArray()) {
            if (seen.add(c)) {
                result.append(c);
            }
        }

        System.out.println("String after removing duplicates: " + result);
    }
}

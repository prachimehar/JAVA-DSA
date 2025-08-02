package Strings;

import java.util.HashMap;

public class DuplicateCharacters {
    public static void main(String[] args) {
        String str = "programming";
        HashMap<Character, Integer> charCount = new HashMap<>();

        for (char c : str.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        System.out.println("Duplicate characters:");
        for (char c : charCount.keySet()) {
            if (charCount.get(c) > 1) {
                System.out.println(c + " = " + charCount.get(c));
            }
        }
    }
}


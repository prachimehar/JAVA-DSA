package Strings;
import java.util.LinkedHashMap;
import java.util.Map;

public class findFirstNonRepeatingCharacter {
    public static Character findFirstNonRepeating(String str) {
        Map<Character, Integer> freqMap = new LinkedHashMap<>();

        for (char ch : str.toCharArray()) {
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return null;
    }
    public static void main(String[] args) {
        String input = "aabcddce";
        Character result = findFirstNonRepeating(input);

        if (result != null) {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }

    }

}

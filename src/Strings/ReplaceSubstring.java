package Strings;

public class ReplaceSubstring {
    public static String manualReplace(String base, String target, String replacement) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        int n = base.length();
        int tLen = target.length();

        while (i < n) {
            // Check if target substring found at index i
            if (i + tLen <= n && base.substring(i, i + tLen).equals(target)) {
                result.append(replacement);
                i += tLen;
            } else {
                result.append(base.charAt(i));
                i++;
            }
        }

        return result.toString();
    }
    public static void main(String[] args) {
        String s = "Hello, World!";
        String oldSub = "World";
        String newSub = "Java";

        String result = s.replaceAll(oldSub, newSub);

        System.out.println("Updated string: " + result);

        // using manual method
        String ans = manualReplace(s, oldSub, newSub);

        System.out.println("Updated string: " + ans);
    }
}

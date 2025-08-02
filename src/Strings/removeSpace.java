package Strings;

public class removeSpace {
    public static String removeSpaces(String input) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch != ' ') {
                result.append(ch);
            }
        }

        return result.toString();
    }
    public static String removeSpacesFromString(String input) {
        return input.replaceAll("\\s+", "");
    }

    public static void main(String[] args) {
        String original = "TCS Ninja Interview Prep";
        String result = removeSpaces(original);
        System.out.println("Without Spaces: " + result);
        String ans = removeSpacesFromString(original);
        System.out.println("Without Spaces: " + ans);
    }
}

package Strings;

public class countNumberVowels {
    public static void main(String[] args) {
        String s = "Prachi Mehar";
        char[] c = s.toCharArray();
        int vowel=0;

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u')
                vowel++;
        }

        System.out.println("Vowels: " + vowel);

    }
}

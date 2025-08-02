package Strings;

public class removeSpecialCharactersInString {
    public static void removeSpecialCharacter(String s) {
        for (int i = 0; i < s.length(); i++)
        {
            if (s.charAt(i) < 'A' || s.charAt(i) > 'Z' && s.charAt(i) < 'a' || s.charAt(i) > 'z')
            {
                s = s.substring(0, i) + s.substring(i + 1);
                i--;
            }
        }
        System.out.print(s);
    }
    public static void main(String[] args) {
        String s = "hel1456lo56wor%^ld";
        s=s.replaceAll("[^a-zA-Z]","");
        System.out.println(s);

        removeSpecialCharacter(s);
    }
}

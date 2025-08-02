package Strings;

public class lengthOfString {
    public static void main(String[] args) {
        int length=0;

        String s = "YouTube";
        for (char c1 : s.toCharArray()) {
            length++;
        }
        System.out.println("Length of String is : "+length);
    }
}

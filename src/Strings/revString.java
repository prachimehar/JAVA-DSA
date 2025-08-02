package Strings;

public class revString {
    public static void main(String[] args) {
        String s = "Prachimehar";
        String rev = "";

        for (int i = s.length()-1; i >=0; i--) {
            rev=rev+s.charAt(i);
        }
        System.out.println(rev);

        // using append and reverse
//        String s ="Prachi Mehar";
//        StringBuilder sb = new StringBuilder();
//        sb.append(s);
//        System.out.println( "String is : "+sb);
//        sb.reverse();
//        System.out.println("Reversed string is : "+sb);
    }
}

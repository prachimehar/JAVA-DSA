package Strings;

public class checkAlphabetOrNot {
    public static void main(String[] args) {

        char ch;
        ch = '9';

        if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')){
            System.out.println(ch + " is an Alphabet");
        }
        else{
            System.out.println(ch + " is not an Alphabet");
        }
    }
}

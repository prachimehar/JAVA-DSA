package Patterns;

public class rectangle {
    public static void main(String[] args) {
        int row = 4;
        int col = 6;

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++)
                System.out.print("*");
            System.out.println();
        }
        System.out.println("----------------------------------------");

        // no.
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++)
                System.out.print(i);
            System.out.println();
        }

        System.out.println("----------------------------------------");

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++)
                System.out.print(j);
            System.out.println();
        }
    }
}

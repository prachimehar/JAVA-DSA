package Patterns;

public class HollowPyramid {
    public static void main(String[] args) {
        int n = 3;

        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print stars and spaces inside the pyramid
            for (int j = 1; j <= 2 * i - 1; j++) {
                // Print star at edges or on the last row
                if (j == 1 || j == 2 * i - 1 || i == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println("---------------------");
        //inverted
        int m=3;
        for (int i = 0; i < m; i++) {
            // Print leading spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // Print stars and spaces
            for (int j = 0; j < 2 * (m - i) - 1; j++) {
                // Print star at edges or on first row
                if (j == 0 || j == 2 * (m - i) - 2 || i == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}

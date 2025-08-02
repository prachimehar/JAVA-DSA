package Patterns;

public class Rhombus {
    public static void main(String[] args) {
        int row = 4;
        int col = 4;
        for (int i=1; i<= row; i++) {
            for (int j=1 ; j<=i ; j++) {
                System.out.print(" ");
            }
            for (int j=1 ; j<=col; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // mirrored
        for(int i=0;i<row;i++)
        {
            for(int j=row;j>i;j--) {
                System.out.print(" ");
            }
            for(int j=0;j<row;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

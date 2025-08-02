package Patterns;

public class Parallelogram {
    public static void main(String[] args) {
        int row = 4;
        int col = 6;

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print(" ");
            for (int j = 1; j <= col; j++)
                System.out.print("*");
            System.out.println();
        }

        //mirrored
        for(int i=0;i<row;i++)      //loop controlling number of rows
        {
            for(int j=1;j>i;j--) //inner loop for spaces
                System.out.print(" "); //printing spaces
            for(int j=0;j<row;j++) //inner loop for printing the stars in each column of a row
                System.out.print("*"); //printing stars
            System.out.println(); // printing a new line after each row
        }
    }
}

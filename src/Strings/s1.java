package Strings;

import java.util.Scanner;

public class s1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take array size input
        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume the leftover newline

        // Declare array and take input
        String[] arr = new String[n];
        System.out.println("Enter " + n + " strings:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }

        // Take prefix input
        System.out.print("Enter prefix to filter: ");
        String prefix = sc.nextLine();

        // Print strings that start with the prefix
        System.out.println("\nStrings starting with \"" + prefix + "\":");
        boolean found = false;
        for (String str : arr) {
            if (str.startsWith(prefix)) {
                System.out.println(str);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No matches found.");
        }

        sc.close();


    }
}

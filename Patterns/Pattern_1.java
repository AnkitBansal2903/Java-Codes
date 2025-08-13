import java.util.Scanner;

public class Pattern_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int n = input.nextInt();

        Pattern(n);  // Call the pattern function
    }

    public static void Pattern(int n) {
        for (int i = 0; i < n; i++) {        // i for rows
            for (int j = 0; j <= i; j++) {   // j for columns
                System.out.print("* ");
            }
            System.out.println();           // New line after each row
        }
    }
}

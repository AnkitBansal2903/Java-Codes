import java.util.Scanner;

public class Pattern_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int n = input.nextInt();

        Pattern(n);  // Call the pattern function
    }
    public static void Pattern(int n) {
        for(int i = 1 ; i<= n ; i++) {
            for(int j=n ; j>=i ; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

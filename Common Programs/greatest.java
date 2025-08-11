package Common_Programs;

import java.util.Scanner;

public class greatest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the value of A,B,C : ");
        int A = input.nextInt();
        int B = input.nextInt();
        int C = input.nextInt();

        if (A>=B && A>=C) {
            System.out.println("A is the Greatest");
        } else if (B>=A && B>=C) {
            System.out.println("B is the Greatest");
        } else {
            System.out.println("C is greatest");
        }
    }
}

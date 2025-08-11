package Common_Programs;

import java.util.Scanner;

public class Prime_No {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number to check :");
        int count = 0;

        int num = input.nextInt();

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println("number is prime");
        } else {
            System.out.println("number is not prime");
        }
    }
}

package Common_Programs;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int a = input.nextInt();  // Original input number

        int num = reverse(a);     // Reversing the number

        System.out.println("Reverse number is " + num);

        // Check if number is palindrome
        if (a == num) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }

    // Function to reverse the digits of a number
    public static int reverse(int num) {
        int newNum = 0;

        while (num > 0) {
            int digit = num % 10;             // Get last digit
            newNum = newNum * 10 + digit;     // Add digit to reversed number
            num = num / 10;                   // Remove last digit
        }

        return newNum;
    }
}

package Common_Programs;

import java.util.Scanner;

public class Armstrong_No {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to check if it's Armstrong: ");
        int num = input.nextInt();
        boolean isArmstrong = isArmstrong(num);
        if (isArmstrong) {
            System.out.println("Your number is Armstrong");
        } else {
            System.out.println("your number is not Armstrong");
        }
    }

    public static boolean isArmstrong(int num) {
        int originalNum = num;  // To compare at the end
        int digits = noOfDigits(num);
        int finalNumber = 0;
        while (num > 0) {
            int digit = num % 10;
            num /= 10;
            finalNumber += pow(digit, digits);  // fixed from 'lastDigit' and 'noOfDigits'
        }
        return finalNumber == originalNum;  // comparing with original number
    }

    public static int pow(int num1, int num2) {
        int result = 1;
        int i = 0;
        while (i < num2) {
            result *= num1;
            i++;
        }
        return result;
    }

    public static int noOfDigits(int num) {
        int digits = 0;
        while (num > 0) {
            digits++;
            num = num / 10;
        }
        return digits;
    }
}

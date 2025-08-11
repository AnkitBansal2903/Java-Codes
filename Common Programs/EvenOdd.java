package Common_Programs;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the No: ");
        int a = input.nextInt();

        if (a % 2 == 0 ){
            System.out.println("Number is even");
        } else {
            System.out.println("number is odd");
        }
    }
}

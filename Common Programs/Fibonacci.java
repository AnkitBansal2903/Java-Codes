package Common_Programs;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = input.nextInt();
        System.out.print("Here is the fibonacci series");
        fibonacci_Series(num);

    }

    public static void fibonacci_Series(int num){
        if (num<0) return;
        System.out.print("0 ");
        if (num ==0) return;
        System.out.print("1 ");

        int first = 0 , second = 1;
        while( first + second <= num) {
            int third = first + second;
            System.out.print(third + " ");

            first = second;
            second = third;

        }

    }
}

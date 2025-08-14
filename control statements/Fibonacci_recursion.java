package Control_Statements___MathClass__String;

import java.util.Scanner;

public class Fibonacci_recursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number want to print : ");
        int count = input.nextInt();
        for(int i=1 ; i<= count ; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int position) {
        if (position == 1) {
            return 0;
        }
        if (position == 2) {
            return 1;
        }
        return fibonacci(position-1) + fibonacci(position-2);
    }
}

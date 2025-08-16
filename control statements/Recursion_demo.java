package Control_Statements___MathClass__String;

import java.util.Scanner;
public class Recursion_demo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = input.nextInt();
        long fact = factorial(num);
        System.out.println("Factorial of your number is : " + fact);

    }

    public static long factorial(int num){
        if(num == 1) {
            return 1;
        }
        return num * factorial(num - 1);
    }
}
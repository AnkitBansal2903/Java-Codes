package Control_Statements___MathClass__String;

import java.util.Scanner;
public class Ternary_Operator {
    public static void main(String[] args){
        Scanner Input = new Scanner(System.in);

        System.out.println("Welcome to calculator");

        System.out.print("Enter the value of a: ");
        int  a = Input.nextInt();

        System.out.print("Enter the value of b:");
        int b = Input.nextInt();

        int greaterNumber = a > b ? a : b;
        System.out.println(greaterNumber + " the the greatest number");
    }
}

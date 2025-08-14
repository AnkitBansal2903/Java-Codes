package Control_Statements___MathClass__String;

import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int num1 = input.nextInt();

        System.out.print("Enter the Second number : ");
        int num2 = input.nextInt();

        System.out.print("Now, Enter the Operation : ");
        String operation = input.next();

        int result = switch (operation) {
            case "+" -> num1 + num2 ;
            case "-" -> num1 - num2 ;
            case "*" -> num1 * num2 ;
            case "/" -> num1 / num2 ;
            default -> -1;
        };

        System.out.println("your answer is : " + result);

    }
}
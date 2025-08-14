package Control_Statements___MathClass__String;

import java.util.Scanner;

public class Absolute_value {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of A: ");
        int num = input.nextInt();

        int result = num >= 0 ? num : -num;
        System.out.println(result);
    }
}
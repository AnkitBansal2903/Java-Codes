package Control_Statements___MathClass__String;

import java.util.Scanner;
public class min_of_two_number_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of a :");
        int a = input.nextInt();

        System.out.print("Enter the value of b: ");
        int b = input.nextInt();

        int smallest = a < b ? a : b;
        System.out.println("Smallest is " + smallest);
    }
}
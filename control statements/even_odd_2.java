package Control_Statements___MathClass__String;

import java.util.Scanner;

public class even_odd_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = input.nextInt();

        String evenOdd = num % 2 == 0  ? "even" : "odd" ;

        System.out.println(evenOdd);

    }
}
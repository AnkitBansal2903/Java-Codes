package Common_Programs;

import java.util.Scanner;

public class product_floating_points {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value of 1st floating point: ");
        float a = input.nextInt();

        System.out.print("Enter the value of 2nd floating point: ");
        float b = input.nextInt();

        float c = a*b;
        System.out.println(c);
    }
}

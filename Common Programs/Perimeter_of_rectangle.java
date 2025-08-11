package Common_Programs;

import java.util.Scanner;

public class Perimeter_of_rectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("enter the value of side A: ");
        double A = input.nextDouble();

        System.out.print("enter the value of side B: ");
        double B = input.nextDouble();

        System.out.print("enter the value of side C: ");
        double C = input.nextDouble();

        System.out.print("enter the value of side D: ");
        double D = input.nextDouble();

        double Perimeter = A+B+C+D;

        System.out.println(Perimeter);


    }
}

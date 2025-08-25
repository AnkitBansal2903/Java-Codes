package Common_Programs;

import java.util.Scanner;

public class Compound_Interest {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.print("Enter the value of Principal amount: ");
        double P = input.nextDouble();

        System.out.print("Enter the value of Rate of Interest: ");
        double R = input.nextDouble();

        System.out.print("Enter the value of time period: ");
        double T = input.nextDouble();

        double I = P*(1 + R/100)*T ;
        System.out.println("Compound Interest is: " + I);
        
    }
}


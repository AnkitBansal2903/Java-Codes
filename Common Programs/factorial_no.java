package Common_Programs;

import java.util.Scanner;

public class factorial_no {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the no for Factorial :");
        int num = input.nextInt();
        long fact = Factorial_number(num);
        System.out.println("Factorial of " +num+" is :" + fact);
    }

    public static long Factorial_number(int num){
        if(num < 2) {
            return 1;
        }
        long fact = 1;
        int i = 2;
        while( i<=num ){
            fact = fact*i;
            i++;
        }
        return fact;
    }

}

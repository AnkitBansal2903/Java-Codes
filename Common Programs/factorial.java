package Common_Programs;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        long fact = Factorial1(num);
        System.out.println("Factorial is : " + fact);

    }

    public static long Factorial1(int num){
        if(num<2){
            return 1;
        }

        long fact = 1;
        int i = 1;
        while (i <= num){
            fact = fact*i;
            i++;
        }
        return fact;

    }
}

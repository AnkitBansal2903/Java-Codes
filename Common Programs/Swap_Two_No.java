package Common_Programs;

import java.util.Scanner;

public class Swap_Two_No {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Numbers to swap");

        System.out.print("Enter the value of First no: ");
        int a = input.nextInt();

        System.out.print("Enter the value of Second No: ");
        int b = input.nextInt();

        a = a+b;
        b = a-b;

        a = a-b;

        System.out.println(" the value of a after exchange is " +a);
        System.out.println(" the value of b after exchange is " +b);
    }
}

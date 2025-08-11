package Common_Programs;

import java.util.Scanner;
public class Add_Two_No {
    public static void main(String[] args){
        Scanner Input = new Scanner(System.in);

        System.out.println("Welcome to calculator");

        System.out.print("Enter the value of a: ");
        int  a = Input.nextInt();

        System.out.print("Enter the value of b:");
        int b = Input.nextInt();

        int c = a+b ;
        System.out.println("The sum of a and b is: " + c );

    }
}

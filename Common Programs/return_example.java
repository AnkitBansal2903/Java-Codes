package Common_Programs;

import java.util.Scanner;

public class return_example {
    public static void main(String[] args){

        greet();
        int first = readNumber();
        int second = readNumber();

        int sum = first + second;
        System.out.println("sum of numbers is : " + sum);

    }

    public static void greet(){
        System.out.println("welcome to the calculator");
    }

    public static int readNumber(){
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number: ");
        int Number = input.nextInt();
        return Number;
    }

}

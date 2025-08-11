package Common_Programs;

import java.util.Scanner;

public class UserInput {

    public static void main(String[] arr){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");

        double name = input.nextFloat();
        System.out.print("good morning:" + name);
    }

}

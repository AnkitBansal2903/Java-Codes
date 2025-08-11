package Common_Programs;

import java.util.Scanner;

public class Relational {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("welcome to driving lisence portal");
        System.out.print("Enter your age: ");
        int age = input.nextInt();

        if (age>=18){
            System.out.println("you are eligible");
        } else {
            System.out.println("jake cycle chala ");
        }
    }
}

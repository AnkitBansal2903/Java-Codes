package Common_Programs;

import java.util.Scanner;

public class conditional_logical {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Ticket Discount Operator");
        System.out.println("please enter ur age: ");
        int age = input.nextInt();
        System.out.println("Are u a female? (true/false)");
        boolean isFemale = input.nextBoolean();

        if ( age < 5 ){
            System.out.println("you got 75% discount");
        } else if (isFemale) {
            System.out.println("you got 50% discount");
        } else if (age > 60 && !isFemale) {
            System.out.println("you got 25% discount");
        } else {
            System.out.println("ypu got no discount");
        }
    }
}

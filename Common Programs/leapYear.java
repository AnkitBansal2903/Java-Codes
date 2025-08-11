package Common_Programs;

import java.util.Scanner;
public class leapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = input.nextInt();

        if (year % 400 == 0 ) {
            System.out.println("Year is a leap year");
            System.out.println("1");
        } else if (year % 100 ==0) {
            System.out.println("year is not a leap year");
            System.out.println("2");
        } else if (year %4 == 0) {
            System.out.println("year is a leap year ");
            System.out.println("3");
        } else {
            System.out.println("year is not a leap year");
            System.out.println("4");
        }
    }
}

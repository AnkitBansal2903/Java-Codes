package Control_Statements___MathClass__String;

import java.util.Scanner;

public class monthOfYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your month number");
        int monthnum = input.nextInt();
        String monthname = getmonthname(monthnum);
        System.out.println(monthname);

    }

    public static String getmonthname(int monthnum) {
        String monthname = switch (monthnum) {
            case 1 -> "Janruary";
            default -> "Mars month" ;
        };
        return monthname;
    }
}
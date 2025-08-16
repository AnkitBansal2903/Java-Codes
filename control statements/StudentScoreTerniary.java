package Control_Statements___MathClass__String;

import java.util.Scanner;
public class StudentScoreTerniary {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Pls enter your marks: ");
        int marks = input.nextInt();

        String category = marks > 80 ? "High" : (marks > 50 ? "moderated" : "low");
        System.out.println("Your category is " + category);
    }
}
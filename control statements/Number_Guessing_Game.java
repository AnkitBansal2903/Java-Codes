package Control_Statements___MathClass__String;
import java.util.Scanner;

public class Number_Guessing_Game {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 5 , guess;
        System.out.println("Welcome to number guessing game");
        do {
            System.out.println("Please the number guess between 0 to 10");
            guess = input.nextInt();
        } while (num != guess );
        System.out.println("Successfully guessed the number");
    }
}

import java.util.Scanner;

public class Multiplication_table {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to multiplication world");
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        printTable(num);

    }
    public static void printTable(int num) {
        int i = 1;
        while (i<=10) {
            System.out.println(num + "X" + i + "=" + (num*i));
            i++;
        }

    }
}

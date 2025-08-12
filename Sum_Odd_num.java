import java.util.Scanner;
public class Sum_Odd_num {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to odd sum");
        System.out.println("Enter the number :");
        int num = input.nextInt();
        int sum = oddSum(num);
        System.out.println("oddSum till "  + num + " is: " + sum);

    }
    public static int oddSum(int num) {
        int sum = 0;
        int i= 1;
        while(i<=num){
            sum = sum + i;
            i = i+2;
        }
        return sum;

    }
}

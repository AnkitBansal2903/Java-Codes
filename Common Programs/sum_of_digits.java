package Common_Programs;

import java.util.Scanner;

public class sum_of_digits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = input.nextInt();
        int sum = Digit_Sum(num);
        System.out.println("sum of digits is :" +sum);
    }
    public static int Digit_Sum(int num){
        int sum = 0;
        while(num >0) {
            sum = sum + (num%10);
            num = num/10;
        }

        return sum;
    }
}

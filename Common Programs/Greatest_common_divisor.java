package Common_Programs;

import java.util.Scanner;

public class Greatest_common_divisor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the First Number :");
        int first = input.nextInt();

        System.out.println("Enter the Second Number :");
        int second = input.nextInt();

        int GCD = gcd(first, second);
        System.out.println("GCD of the number is :" + GCD);

    }

    public static int gcd(int first, int second) {
        int gcd = 1;
        int i = 2;
        int least = least(first, second);
        while (i <= least) {
            if (first % i == 0 && second % i == 0) {
                gcd = i;
            }
            i++;
        }


        return gcd;

    }
        public static int least ( int num1, int num2){
            if (num1 < num2) {
                return num1;
            } else {
                return num2;
            }
        }
    }

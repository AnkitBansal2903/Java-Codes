package Common_Programs;

import java.util.Scanner;

public class PrimeNo2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number to check :");
        int num = input.nextInt();
        boolean isPrime = isPrime(num);
        if (isPrime) {
            System.out.println("Prime");
        } else {
            System.out.println("not prime");
        }
    }
    public static boolean isPrime(int num){
        int i = 2;
        while(i<num) {
            if(num %i == 0){
                return false;
            }
            i++;

        }
        return true;
    }
}



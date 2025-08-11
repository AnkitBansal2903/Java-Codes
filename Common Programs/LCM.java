package Common_Programs;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the First number :");
        int first = input.nextInt();
        System.out.println("Enter the Second number:");
        int second = input.nextInt();
        int Lcm = lcm(first,second);
        System.out.println("Lcm of numbers is " + Lcm);

    }

    public static int lcm(int first, int second){
        int i=1;
        while( i<= second){
            int factor = first*i;
            if (factor % second == 0) {
                return factor;
            }
            i++;
        }

        return 0 ; //unreachable

    }

}

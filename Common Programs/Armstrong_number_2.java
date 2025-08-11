package Common_Programs;

import java.util.Scanner;
public class Armstrong_number_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,arm=0,rem,c;
        System.out.println("Enter any number : ");
        n = input.nextInt();
        c=n;

        while(n>0){
            rem = n%10;
            arm = (rem*rem*rem)+arm;
            n = n/10;
        }
        if(c==arm) {
            System.out.println("armstrong number");
        } else {
            System.out.println("not armstrong");
        }
    }
}

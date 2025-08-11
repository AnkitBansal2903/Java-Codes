package Common_Programs;

import java.util.Scanner;
public class arithematic_operator {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("Enter the value of A: ");
        int a = input.nextInt();

        System.out.println("Enter the value of B: ");
        int b = input.nextInt();

        int Addition = a+b;
        System.out.println(Addition);

        int Sub = a-b;
        System.out.println(Sub);

        int Div = a/b;
        System.out.println(Div);

        int modulo = a%b;
        System.out.println(modulo);

        int mul = a*b;
        System.out.println(mul);

    }
}

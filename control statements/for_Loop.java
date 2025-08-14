package Control_Statements___MathClass__String;

import java.util.Scanner;
public class for_Loop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("enter number till want to print: ");
        int n = input.nextInt();

        for(int i= 0 ; i<=n ; i++){
            System.out.print(i + ", ");
        }
    }
}
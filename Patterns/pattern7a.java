import java.util.Scanner;

public class pattern7a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the no of rows: ");
        int rows = input.nextInt();

        for(int i=1 ; i<=rows ; i++){
            for(int j=rows ; j>=i ; j--){
                System.out.print(" ");
            }
            for(int k= 1;k<=i; k++){
            System.out.print("*");
        }
            for(int l=2 ; l<=i ; l++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

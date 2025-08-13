import java.util.Scanner;

public class pattern6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the no of rows: ");
        int rows = input.nextInt();

        for(int i = 1 ; i <= rows; i++){
            for(int j=1 ; j<= rows -i ; j++){
                System.out.print(" ");
            }
            for(int k=1 ; k<=i ; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 1 ; i<rows ; i++){
            for(int j=1 ; j<= i ;j++){
                System.out.print(" ");
            }
            for(int k=rows - 1; k>=i ; k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

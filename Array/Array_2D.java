import java.util.Scanner;
public class Array_2D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] arr = new int[2][3];
        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;
        arr[1][1] = 4;
        arr[1][2] = 5;
        arr[1][0] = 6;

        System.out.print("enter the value of row: ");
        int i = input.nextInt();

        System.out.print("Enter the value of column :  ");
        int j = input.nextInt();

        System.out.println(arr[i][j]);
    }
}

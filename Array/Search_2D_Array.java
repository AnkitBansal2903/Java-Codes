import java.util.Scanner;
public class Search_2D_Array {
    public static void main(String[] args) {
        System.out.println("Search in 2D array");
        Scanner input = new Scanner(System.in);
        int[][] numArr = Array_Utilities.input2DArray();
        System.out.println("Enter the number want to search");
        int num = input.nextInt();
        boolean isfound = search(numArr , num);
        if (isfound) {
            System.out.println("Your number was found" );
        } else {
            System.out.println(" your number was not found");
        }
    }

    public static boolean search(int[][] numArr, int num){
        int i = 0;
        while(i < numArr.length) {
            int j = 0;
            while( j < numArr[i].length ) {
                if(numArr[i][j] == num) {
                    return true;
                }
                j++;
            }
            i++;
        }

        return false;
    }
}

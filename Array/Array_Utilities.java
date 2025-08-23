import java.util.Scanner;

public class Array_Utilities {
    public static int[] inputArray() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the no of elements: ");
        int size = input.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter your elements numbers " + (i + 1) + ": ");
            nums[i] = input.nextInt();
        }
        return nums;
    }



    public static int[][] input2DArray() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the no of rows: ");
        int rows = input.nextInt();
        System.out.println("Enter the no of columns: ");
        int columns = input.nextInt();

        int[][] numArray = new int[rows][columns];

        int i = 0;
        while(i < rows){
            int j = 0;
            while(j < columns) {
                System.out.println("Please enter elements rows: " +(i+1) +", column: " +(j+1) + " ");
                numArray[i][j] = input.nextInt();
                j++;
            }
            i++;
        }

        return numArray;
    }




    public static void displayArray(int[] numArray) {
        int i = 0;
        while(i < numArray.length) {
            System.out.print(numArray[i] + " ");
            i++;
        }
        System.out.println();
    }
}


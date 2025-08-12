import java.util.Scanner;

public class Delete_a_specific_element {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numArr = Array_Utilities.inputArray();
        System.out.println("Enter the number you want to delete: ");
        int numToDelete = input.nextInt();
        int[] newArr = deleteNumber(numArr , numToDelete);
        System.out.println("Here is your new number");
        Array_Utilities.displayArray(newArr);
    }

    public static int[] deleteNumber(int[] numArr , int numToDelete) {
        int occ = OccurenceArray.noOfOcuurences(numArr , numToDelete);

        if(occ == 0) {
            return numArr;
        }

        int newSize = numArr.length - occ;
        int[] newArr = new int[newSize];

        int i = 0, j = 0;
        while (i < numArr.length) {
            if (numArr[i] != numToDelete) {
                newArr[j] = numArr[i];
                j++;
            }
            i++;
        }

        return newArr;

    }
}

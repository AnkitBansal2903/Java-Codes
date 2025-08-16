package Control_Statements___MathClass__String;
import java.util.Scanner;

public class OCCURENCES_FOR_Each {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] nums = Array_Utilities.inputArray();
        System.out.println("Enter the number you want to search : ");
        int element = input.nextInt();
        int occ = countOcuurences(nums, element);
        System.out.println(occ);
    }

    public static int countOcuurences(int[] nums , int element){
        int occ = 0;
        for(int num : nums)
        {
            if (num == element) {
                occ ++;
            }
        }
        return occ;
    }

}

import java.util.Scanner;
public class OccurenceArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Array occurence");
        int[] numArr = Array_Utilities.inputArray();

        System.out.println("Enter the number you want to find: ");
        int num = input.nextInt();

        int occurences = noOfOcuurences(numArr,num);
        System.out.println("your elements was found " + occurences + " times in the array");

    }

    public static int noOfOcuurences(int[] numArr, int num ){
        int occ = 0;
        for(int i= 0; i<numArr.length ; i++){
            if(numArr[i] == num){
                occ++;
            }

        }

        return occ ;
    }
}

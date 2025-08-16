package Control_Statements___MathClass__String;

import java.util.Scanner;

public class sum_Poisitve_continue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numArr = Array_Utilities.inputArray();

        int sum = 0;
        for(int num : numArr){
            if(num < 0 ){
                continue;
            }
            sum += num;
        }
        System.out.println("sum of positive numbers is " + sum);

    }
}

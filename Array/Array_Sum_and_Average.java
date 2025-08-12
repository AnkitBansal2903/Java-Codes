import java.util.Scanner;
public class Array_Sum_and_Average {
    public static void main(String[] args) {
        System.out.println("Welcome to sum and average");

        int[] numArray = Array_Utilities.inputArray();

        long sum = sum(numArray);
        int avg = average(numArray);
        System.out.println("Sum of the numbers is " + sum);
        System.out.println("Average of the numbers is " + avg);

        }
        public static long sum(int[] numArray){
        long sum = 0;
        for(int i = 0 ; i<numArray.length ; i++){
            sum = sum + numArray[i];
        }

        return sum;
        }

        public static int average(int[] numArray){
        long sum = sum(numArray);
        return (int) (sum / numArray.length);
        }
    }


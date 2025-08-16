package Control_Statements___MathClass__String;

public class Max_value_array {
    public static void main(String[] args) {
        int[] arr = Array_Utilities.inputArray();

        int max = Integer.MIN_VALUE;
        for(int num:arr) {
            if (max < num) {
                max = num;
            }
        }
        System.out.println("Maximum number is " + max);
    }
}

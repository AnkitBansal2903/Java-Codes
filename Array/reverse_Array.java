public class reverse_Array {
    public static void main(String[] args) {
        System.out.println("Welcome to reversing program");
        int[] numArr = Array_Utilities.inputArray();
        reverse(numArr);
        System.out.println("Reverse array is :");
        Array_Utilities.displayArray(numArr);
    }
    public static void reverse(int[] arr) {
        int i = 0;
        while(i < arr.length / 2) {
            int swap = arr[i];
            arr[i] = arr[(arr.length -1) - i];
            arr[(arr.length - 1) - i] = swap;
            i++;
        }
    }
}

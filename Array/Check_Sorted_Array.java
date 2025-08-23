public class Check_Sorted_Array {
    public static void main(String[] args) {
        int[] numArr = Array_Utilities.inputArray();

        boolean inc = isIncreasing(numArr);
        boolean dec = isDecreasing(numArr);
        if(inc || dec) {
            System.out.println("Your Array is sorted");
        } else {
            System.out.println("your arr is not sorted");
        }

    }
    public static boolean isIncreasing(int[] numArr){
        int i = 1;
        while(i < numArr.length){
            if (numArr[i] < numArr[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }

    public static boolean isDecreasing(int[] numArr){
        int i = 1;
        while(i < numArr.length){
            if (numArr[i] > numArr[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }
}

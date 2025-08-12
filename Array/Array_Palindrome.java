public class Array_Palindrome {
    public static void main(String[] args) {
        System.out.println("Checking Palindrome in array");
        int[] numArr = Array_Utilities.inputArray();
        boolean isPalin = isPalindrome(numArr);
        if(isPalin) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

    }
    public static boolean isPalindrome(int[] numArr) {
        int i = 0;
        while ( i <numArr.length / 2) {
            if (numArr[i] != numArr[numArr.length - 1 - i]) {
                return false;
            }
            i++;
        }

        return true;
    }
}

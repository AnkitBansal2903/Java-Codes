package Control_Statements___MathClass__String;

import java.util.Scanner;

public class Palindrome_recursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number : ");
        String str = input.next();
        System.out.println("your string is " + ((ispalindrome(str) ? "Palindrome" : "not palindrome")));

    }

    public static boolean ispalindrome(String str){

        System.out.print(".");

        if(str.length() <= 1) {
            return true;
        }
        int lastpos = str.length() - 1;
        if (str.charAt(0) != str.charAt(lastpos)) {
            return false;
        }
        String newstr = str.substring(1,lastpos);
        return ispalindrome(newstr);
    }
}

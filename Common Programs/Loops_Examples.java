package Common_Programs;

import java.util.Scanner;
public class Loops_Examples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 1;
        while (num <= 10) {
            System.out.println(num * 2 );
            num = num + 1;
        }
    }
}

import java.util.Scanner;

public class Password_Checker_Do_While {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String password;
        do{
            System.out.println("Pls enter your password");
            password = input.next();
        } while (!isvalidPassword(password));
        System.out.println("thanks for entering the password");
    }

    public static boolean isvalidPassword(String password) {

        return password.length() > 6 ;
    }
}

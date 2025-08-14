package Control_Statements___MathClass__String;

import java.util.Scanner;

public class ExitOnExit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(true) {
            System.out.println("Enter your Command: ");
            String command = input.next();
            if(command.equalsIgnoreCase("exit")){
                break;
            }
        }
        System.out.println("you have successfully exited");
    }
}

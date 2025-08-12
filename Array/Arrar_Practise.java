import java.util.Scanner;
public class Arrar_Practise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] list = new int[10];
        list[1] = 1;
        list[2] = 12;
        list[3] = 123;
        list[4] = 1234;
        list[5] = 12345;
        list[6] = 123456;

        System.out.print("Enter the indexing value : ");
        int i = input.nextInt();
        System.out.println(list[i]);


    }
}

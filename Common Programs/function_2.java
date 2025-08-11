package Common_Programs;

public class function_2 {
    public static void main(String[] args) {
        pattern();

    }
    public static void pattern(){
        int rows = 0;
        while (rows < 15){
            System.out.print("*");
            int i = 0;
            while (i < rows){
                System.out.print(" *");
                i++;
            }
            System.out.println();
            rows++;
        }
    }
}

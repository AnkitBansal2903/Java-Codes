package Control_Statements___MathClass__String;

public class for_each {
    public static void main(String[] args) {
        String[] array = new String[] {
                "Ram", "Shyam", "Mohan" , "Madan", "Sita" , "geeta"
        };
        printArray(array);
    }

    public static void printArray(String[] array){
        for(String name: array) {
            System.out.println(name);
        }
    }
}
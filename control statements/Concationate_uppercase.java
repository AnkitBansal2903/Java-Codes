package Control_Statements___MathClass__String;

public class Concationate_uppercase {
    public static void main(String[] args) {

        String firstName = "Ankit";
        String secondName = "Bansal";

        String fullName = firstName.concat(" ").concat(secondName);
        System.out.println(fullName.toUpperCase());
    }
}
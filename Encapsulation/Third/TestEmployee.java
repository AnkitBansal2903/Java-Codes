package inbuild.Example.Encapsulation.Third;

public class TestEmployee {
    public static void main(String[] args) {
        Employee emp = new Employee(22 , "Ankit Bansal" , 1200000);
        System.out.println(emp.getEmployeeDetails());
        emp.setName("Akki");
        System.out.println(emp.getEmployeeDetails());
    }
}

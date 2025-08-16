package Control_Statements___MathClass__String;

import java.util.Scanner;

public class STUDENT_toString {
    String name;

    int age;

    String rollnumber;

    String house;

    public STUDENT_toString(String name, int age, String rollnumber, String house) {
        this.name = name;
        this.age = age;
        this.rollnumber = rollnumber;
        this.house = house;
    }

    public String toString() {
        return "Student Details :{name :"+name+" , " +
                "age:" + age + ", roll number: "
                + rollnumber + ", house: "
                + house + " }" ;
    }


    public static void main(String[] args) {
        STUDENT_toString stu = new STUDENT_toString("Prashant" , 22 , "abcdde" , "agni");
        System.out.println(stu);
    }
}

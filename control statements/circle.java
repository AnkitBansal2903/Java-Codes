package Control_Statements___MathClass__String;

import java.util.Scanner;

public class circle {
    double radiusInMm;

    circle(double radiusInMm){
        this.radiusInMm = radiusInMm;
    }

    double getCircumference() {
        return  2 * radiusInMm * Math.PI;
    }

    double getArea() {
        return Math.PI * Math.pow(radiusInMm,2);
    }

    public String toString() {
        return " circle props: radius in mm: " + radiusInMm +
                ", Circumference in mm: " + getCircumference() +
                ", Area in mm2: " + getArea();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius : ");
        double radius = input.nextDouble();

        circle cir = new circle(radius);
        System.out.println(cir);
    }
}

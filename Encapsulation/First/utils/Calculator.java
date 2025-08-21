package inbuild.Example.Encapsulation.First.utils;

import inbuild.Example.Encapsulation.First.geometry.Circle;
import inbuild.Example.Encapsulation.First.geometry.Rectangle;

public class Calculator {
    public static void main(String[] args) {
        Circle cir = new Circle(5.5);
        Rectangle rect = new Rectangle(10,5);

        double cirArea = Math.PI * Math.pow(cir.radius, 2);
        double rectArea = rect.breadth * rect.lenght;

        System.out.printf("Area of the circle is : %s , Area of the rectange is : %s" ,cirArea ,rectArea);
    }
}

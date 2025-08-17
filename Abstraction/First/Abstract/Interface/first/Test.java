package Example.Abstraction.Abstract.Interface.first;

public class Test {
    public static void main(String[] args) {
        Circle cir = new Circle(5);
        System.out.println("Circle " + cir.calculateArea());

        Square sq = new Square(10.3);
        System.out.println("Square " + cir.calculateArea());

    }
}

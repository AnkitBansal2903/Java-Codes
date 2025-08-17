package Example.Abstraction.Abstract.Interface.first;

public class Square extends Shape {

    private final double sideInCms;

    public Square(double sideInCms) {
        this.sideInCms = sideInCms;
    }

    public double getSideInCms() {
        return sideInCms;
    }

    public double calculateArea() {
        return sideInCms * sideInCms;
    }

}

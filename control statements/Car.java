public class Car {
    int noOfWheels;

    int noOfDoors;

    int maxSpeed;

    String name;

    String modelNumber;

    String Company;

    public Car(int noOfWheels, int noOfDoors, int maxSpeed, String name, String modelNumber, String company) {
        this.noOfWheels = noOfWheels;
        this.noOfDoors = noOfDoors;
        this.maxSpeed = maxSpeed;
        this.name = name;
        this.modelNumber = modelNumber;
        this.Company = company;
    }


    @Override
    public String toString() {
        return "Car{" +
                "noOfWheels=" + noOfWheels +
                ", noOfDoors=" + noOfDoors +
                ", maxSpeed=" + maxSpeed +
                ", name='" + name + '\'' +
                ", modelNumber='" + modelNumber + '\'' +
                ", Company='" + Company + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Car Swift = new Car(4,4,120,"Swift" , "Sw876" ,"Maruti");
        System.out.println(Swift.toString());
    }
}

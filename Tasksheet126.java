class Vehicle {
    
    String makeName;
    String modelName;
    int manufacturingYear;

    Vehicle(String makeName, String modelName, int manufacturingYear) {

        this.makeName = makeName;
        this.modelName = modelName;
        this.manufacturingYear = manufacturingYear;
    }
}
class Car extends Vehicle {

    int numberOfDoors;

    Car(String makeName, String modelName, int manufacturingYear, int numberOfDoors) {
        super(makeName, modelName, manufacturingYear);
        this.numberOfDoors = numberOfDoors;
    }
    void displayDetails() {
        System.out.println("\nCar Details:" + "\nMake: " + makeName + "\nModel: " + modelName + "\nYear: " +
                        manufacturingYear + "\nNumber of Doors: " + numberOfDoors + "\n");
    }
}

public class Tasksheet126 {
    public static void main(String[] args) {
        Car car = new Car("Honda", "Civic", 2024, 4);
        car.displayDetails();
    }
}

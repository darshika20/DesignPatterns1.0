package abstractFactory;

import factory.Vehicle;

public class ToyotaBike extends Vehicle {
    @Override
    public void identify() {
        System.out.println("Congratulations! You have purchased Brand new Toyota Bike");
    }
}

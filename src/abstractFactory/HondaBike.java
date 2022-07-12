package abstractFactory;

import factory.Vehicle;

public class HondaBike extends Vehicle {

    @Override
    public void identify() {
        System.out.println("Congratulations! You have purchased Brand new Honda Car");
    }
}

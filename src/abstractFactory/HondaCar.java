package abstractFactory;

import factory.Vehicle;

public class HondaCar extends Vehicle {
    @Override
    public void identify() {
        System.out.println("Congratulations! You have purchased Brand new Honda Car");
    }
}

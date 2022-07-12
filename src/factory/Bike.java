package factory;

public class Bike extends Vehicle {

    @Override
    public void identify() {
        System.out.println("Brand new Bike has been created!");
    }
}

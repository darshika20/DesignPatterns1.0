package factory;

public class Car extends Vehicle{

    @Override
    public void identify() {
        System.out.println("Brand new Car has been created!");
    }
}

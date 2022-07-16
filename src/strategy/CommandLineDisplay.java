package strategy;

public class CommandLineDisplay implements IDisplayStrategy{

    @Override
    public void display() {
        System.out.println("Displaying as CommandLine Display");
    }
}

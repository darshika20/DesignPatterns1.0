package strategy;

public class SimpleFly implements IFlyStrategy{

    @Override
    public void fly() {
        System.out.println("Flying with Simple Fly Strategy");
    }
}

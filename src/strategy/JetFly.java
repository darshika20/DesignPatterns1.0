package strategy;

public class JetFly implements IFlyStrategy{

    @Override
    public void fly() {
        System.out.println("Flying with Jet Fly Strategy");
    }
}

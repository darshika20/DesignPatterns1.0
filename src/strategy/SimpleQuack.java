package strategy;

public class SimpleQuack implements IQuackStrategy{

    @Override
    public void quack() {
        System.out.println("Quacking with Simple Quack Strategy");
    }
}

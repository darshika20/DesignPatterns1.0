package strategy;

public class NoQuack implements IQuackStrategy{

    @Override
    public void quack() {
        System.out.println("Sorry! no quacking feature available");
    }
}

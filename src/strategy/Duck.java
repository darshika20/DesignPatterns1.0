package strategy;

public class Duck {

    private IFlyStrategy flyStrategy;
    private IQuackStrategy quackStrategy;
    private IDisplayStrategy displayStrategy;
    private String name;

    public Duck(IFlyStrategy flyStrategy, IQuackStrategy quackStrategy, IDisplayStrategy displayStrategy, String name) {
        this.flyStrategy = flyStrategy;
        this.quackStrategy = quackStrategy;
        this.displayStrategy = displayStrategy;
        this.name = name;
    }

    public void fly() {
        this.flyStrategy.fly();
    }

    public void quack() {
        this.quackStrategy.quack();
    }

    public void display() {
        System.out.println("Hi! I am " +  name);
        quack();
        fly();
        this.displayStrategy.display();
    }
}

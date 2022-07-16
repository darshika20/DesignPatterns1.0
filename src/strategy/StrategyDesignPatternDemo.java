package strategy;

public class StrategyDesignPatternDemo {

    public static void main(String[] args) {
        IQuackStrategy simpleQuack = new SimpleQuack();
        IQuackStrategy noQuack = new NoQuack();
        IFlyStrategy simplefly = new SimpleFly();
        IFlyStrategy jetFly = new JetFly();
        IDisplayStrategy graphicDisplay = new GraphicDisplay();
        IDisplayStrategy textDisplay = new CommandLineDisplay();
        Duck simpleDuck = new Duck(simplefly, simpleQuack, textDisplay, "simple Duck");
        Duck enhancedDuck = new Duck(jetFly, noQuack, graphicDisplay, "advanced Duck");
        simpleDuck.display();
        enhancedDuck.display();
    }
}

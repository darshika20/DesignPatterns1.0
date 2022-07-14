package decorator;

public class DecoratorDesignPatternDemo {

    public static void main(String[] args) {

        Dress basicDress = new BasicDress();
        basicDress.assemble();

        Dress basicFancyDress = new FancyDress(new BasicDress());
        basicFancyDress.assemble();

        Dress basicSportyDress = new SportyDress(new BasicDress());
        basicSportyDress.assemble();

        Dress basicFancySportyDress = new SportyDress(new FancyDress(new BasicDress()));
        basicFancySportyDress.assemble();
    }
}

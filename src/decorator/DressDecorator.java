package decorator;

public class DressDecorator implements Dress{

    protected Dress dress;

    public DressDecorator(Dress dress) {
        this.dress = dress;
    }

    @Override
    public void assemble() {
        dress.assemble();
    }
}

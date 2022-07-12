package abstractFactory;

public class MacButton implements GuiFeature{

    @Override
    public void create() {
        System.out.println("Button to be displayed on Mac has been created!");
    }
}
